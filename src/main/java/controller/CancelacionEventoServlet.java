package controller;

import model.EventoMusical;
import model.data.dao.EventoDAO;
import org.jooq.DSLContext;

import java.util.List;

public class CancelacionEventoServlet {
    private EventoDAO eventoDAO;

    public CancelacionEventoServlet(DSLContext query) {
        this.eventoDAO = new EventoDAO(query);
    }

    public void cancelarEvento(DSLContext query, EventoMusical evento) {
        if (evento != null) {
            eventoDAO.cancelarEvento(query, evento); // Llamada al método cancelarEvento en EventoDAO para cancelar el evento
            System.out.println("Evento cancelado con éxito: " + evento.getNombreEvento());
            // Aquí podrías incluir lógica adicional, como notificar a los asistentes, etc.
        } else {
            System.out.println("Error: Intento de cancelar evento fallido");
        }
    }
}