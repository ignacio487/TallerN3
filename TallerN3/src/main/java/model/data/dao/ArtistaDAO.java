package model.data.dao;

import model.Artista;
import org.jooq.DSLContext;

public class ArtistaDAO {
    private DSLContext query;

    public ArtistaDAO(DSLContext query) {
        this.query = query;
    }

    public void guardarArtista(Artista artista) {
        query.insertInto("tabla_artista").set("nombre", artista.getNombreArtistico()).set("genero", artista.getGeneroMusical()).execute();
        System.out.println("Artista guardado con éxito: " + artista.getNombreArtistico());
    }

    public void actualizarArtista(Artista artista) {
        query.update("tabla_artista").set("genero", artista.getGeneroMusical()).where("id = ?", artista.getNombreArtistico()).execute();
        System.out.println("Artista actualizado con éxito: " + artista.getNombreArtistico());
    }

    public void eliminarArtista(Artista artista) {

        query.delete("tabla_artista").where("id = ?", artista.getNombreArtistico()).execute();
        System.out.println("Artista eliminado con éxito: " + artista.getNombreArtistico());
    }
}