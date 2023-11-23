package controller;

import model.Asistente;
import model.data.dao.AsistenteDAO;
import org.jooq.DSLContext;

public class RegistroAsistenteServlet {
    private AsistenteDAO asistenteDAO;

    public RegistroAsistenteServlet(DSLContext query) {
        this.asistenteDAO = new AsistenteDAO(query);
    }

    public void registrarAsistente(DSLContext query, String nombre) {
        Asistente nuevoAsistente = new Asistente(nombre);

        if (nuevoAsistente != null) {
            asistenteDAO.guardarAsistente(nuevoAsistente); // Llamada al método en AsistenteDAO para guardar el nuevo asistente
            System.out.println("Asistente registrado con éxito: " + nombre);
        } else {
            System.out.println("Error: Intento de registro de asistente fallido");
        }
    }
}
