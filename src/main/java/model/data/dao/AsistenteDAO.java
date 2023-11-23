package model.data.dao;

import model.Asistente;
import org.jooq.DSLContext;

public class AsistenteDAO {
    private DSLContext query;

    public AsistenteDAO(DSLContext query) {
        this.query = query;
    }

    public void guardarAsistente(Asistente asistente) {
        // query.insertInto("tabla_asistente").set("nombre", asistente.getNombre()).execute();
        System.out.println("Asistente guardado con éxito: " + asistente.getNombre());
    }

    public void actualizarAsistente(Asistente asistente) {
        // query.update("tabla_asistente").set("alguna_columna", valor).where("id = ?", asistente.getId()).execute();
        System.out.println("Asistente actualizado con éxito: " + asistente.getNombre());
    }

    public void eliminarAsistente(Asistente asistente) {
        // query.delete("tabla_asistente").where("id = ?", asistente.getId()).execute();
        System.out.println("Asistente eliminado con éxito: " + asistente.getNombre());
    }
}
