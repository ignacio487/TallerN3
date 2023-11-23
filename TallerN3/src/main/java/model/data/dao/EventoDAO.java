package model.data.dao;

import model.EventoMusical;
import org.jooq.DSLContext;

public class EventoDAO {
    private DSLContext query;

    public EventoDAO(DSLContext query) {
        this.query = query;
    }

    public void crearEvento(DSLContext query, EventoMusical evento) {
        // Lógica para guardar el evento en la base de datos utilizando el DSLContext o la conexión a la base de datos
        System.out.println("Evento creado con éxito: " + evento.getNombreEvento());
    }

    public void cancelarEvento(DSLContext query, EventoMusical evento) {
        // Lógica para cancelar un evento en la base de datos utilizando el DSLContext o la conexión a la base de datos
        System.out.println("Evento cancelado con éxito: " + evento.getNombreEvento());
    }
}