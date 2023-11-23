package controller;

import model.data.dao.EventoDAO;
import org.jooq.DSLContext;

import java.util.ArrayList;

public class CancelacionEventoServlet {

    private EventoDAO eventoDAO;

    public CancelacionEventoServlet(DSLContext query) {
        this.eventoDAO = new EventoDAO();
    }

}
