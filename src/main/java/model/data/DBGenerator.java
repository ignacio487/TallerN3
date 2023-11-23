package model.data;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import java.sql.Connection;
public class DBGenerator {

    public static void iniciarBD(String nombreBD) {
        try {
            Connection connection = DBConnector.connection(nombreBD, "root", "");

            DSLContext create = DSL.using(connection, SQLDialect.MYSQL);

            crearBaseDato(create, nombreBD);

            create = actualizarConexion(connection, nombreBD);

            crearTablas(create);

            DBConnector.closeConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void crearBaseDato(DSLContext create, String nombreBD) {
        create.createDatabaseIfNotExists(nombreBD).execute();
    }

    private static DSLContext actualizarConexion(Connection connection, String nombreBD) {
        DBConnector.closeConnection();

        connection = DBConnector.connection(nombreBD, "root", "");
        return DSL.using(connection, SQLDialect.MYSQL);
    }
}