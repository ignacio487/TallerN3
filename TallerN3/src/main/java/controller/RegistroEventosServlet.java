package controller;

import model.data.dao.EventoDAO;
import org.jooq.DSLContext;

import java.util.ArrayList;

public class RegistroEventosServlet {
    private EventoDAO eventoDAO;

    public RegistroEventosServlet(DSLContext query) {
        this.eventoDAO = new EventoDAO();
    }

    public void crearEvento(DSLContext query, Evento evento){
        if (evento != null){
            eventoDAO.crearEvento(query, evento);
            System.out.println("Evento Registrado con exito: " + evento.getFecha())
        } else {
            System.out.println("Error : Intento de agregar evento fallido")
        }
    }

    
}
