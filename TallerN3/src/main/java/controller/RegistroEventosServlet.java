package controller;

import model.EventoMusical;
import model.data.dao.EventoDAO;
import org.jooq.DSLContext;

public class RegistroEventosServlet {
    private EventoDAO eventoDAO;

    public RegistroEventosServlet(DSLContext query) {
        this.eventoDAO = new EventoDAO(query);
    }

    public void agregarEventoEnAgenda(DSLContext query, EventoMusical evento) {
        if (evento != null) {
            eventoDAO.crearEvento(query, evento); // Llamada al método crearEvento en EventoDAO para guardar el evento
            System.out.println("Evento agregado a la agenda: " + evento.getNombreEvento());
            // Aquí podrías realizar acciones adicionales relacionadas con la agenda
            // Por ejemplo, notificar a los usuarios, etc.
        } else {
            System.out.println("Error: Intento de agregar evento a la agenda fallido");
        }
    }
}