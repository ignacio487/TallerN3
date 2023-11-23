package model.data.dao;

import model.Asistente;
import org.jooq.DSLContext;

public class AsistenteDAO {
    private DSLContext query;

    public AsistenteDAO(DSLContext query) {
        this.query = query;
    }

    public void guardarAsistente(Asistente asistente) {
        try {
            query.insertInto("tabla_asistente")
                    .set("nombre", asistente.getNombre())
                    .execute();
            System.out.println("Asistente guardado con éxito: " + asistente.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar el asistente: " + e.getMessage());
        }
    }

    public void actualizarAsistente(Asistente asistente) {
        try {
            query.update("tabla_asistente")
                    .set("alguna_columna", "nuevo_valor")  // Ajusta la columna y el nuevo valor
                    .where("id = ?", asistente.getNombre())   // Ajusta la condición según tu esquema
                    .execute();
            System.out.println("Asistente actualizado con éxito: " + asistente.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el asistente: " + e.getMessage());
        }
    }

    public void eliminarAsistente(Asistente asistente) {
        try {
            query.delete("tabla_asistente")
                    .where("id = ?", asistente.getNombre())   // Ajusta la condición según tu esquema
                    .execute();
            System.out.println("Asistente eliminado con éxito: " + asistente.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el asistente: " + e.getMessage());
        }
    }
}
