package controller;

import model.Artista;
import model.data.dao.ArtistaDAO;
import org.jooq.DSLContext;

public class RegistroArtistaServlet {
    private ArtistaDAO artistaDAO;

    public RegistroArtistaServlet(DSLContext query) {
        this.artistaDAO = new ArtistaDAO(query);
    }

    public void registrarArtista(DSLContext query, String nombreArtistico, String generoMusical) {
        Artista nuevoArtista = new Artista(nombreArtistico, generoMusical);

        if (nuevoArtista != null) {
            artistaDAO.guardarArtista(nuevoArtista); // Llamada al método en ArtistaDAO para guardar el nuevo artista
            System.out.println("Artista registrado con éxito: " + nombreArtistico);
        } else {
            System.out.println("Error: Intento de registro de artista fallido");
        }
    }
}