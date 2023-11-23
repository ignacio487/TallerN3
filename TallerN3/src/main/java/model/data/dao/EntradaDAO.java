package model.data.dao;

import model.Entrada;
import org.jooq.DSLContext;

public class EntradaDAO {
    private DSLContext query;

    public EntradaDAO(DSLContext query) {
        this.query = query;
    }

    public void venderEntrada(Entrada entrada) {
        query.insertInto("tabla_entradas")
                .set("tipo", entrada.getTipo())
                .set("precio", entrada.getPrecio())
                .set("cantidad", entrada.getCantidadDisponible())
                .execute();

        System.out.println("Entradas vendidas con éxito para el evento: " + entrada.getEvento().getNombreEvento());
    }
}