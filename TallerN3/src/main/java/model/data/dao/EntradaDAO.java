package model.data.dao;

import model.Entrada;
import org.jooq.DSLContext;
import org.jooq.exception.DataAccessException;

public class EntradaDAO {
    private DSLContext query;

    public EntradaDAO(DSLContext query) {
        this.query = query;
    }

    public void venderEntrada(DSLContext query, Entrada entrada) {
        try {
            this.query.insertInto("tabla_entradas")
                    .set("tipo", entrada.getTipo())
                    .set("precio", entrada.getPrecio())
                    .set("cantidad", entrada.getCantidadDisponible())
                    .execute();

            System.out.println("Entradas vendidas con éxito para el evento: " + entrada.getEvento().getNombreEvento());
        } catch (DataAccessException e) {
            System.out.println("Error al vender entradas: " + e.getMessage());
                 }
    }
}