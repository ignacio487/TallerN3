package model.data.dao;

import model.Artista;
import org.jooq.DSLContext;

public class ArtistaDAO {
    private DSLContext query; // Esta es la conexión a la base de datos o contexto para realizar consultas

    public ArtistaDAO(DSLContext query) {
        this.query = query;
    }

    public void guardarArtista(Artista artista) {
        // Lógica para guardar el artista en la base de datos utilizando el DSLContext o la conexión a la base de datos
        // Ejemplo (usando sintaxis pseudo-código):
        // query.insertInto("tabla_artista").set("nombre", artista.getNombre()).set("genero", artista.getGenero()).execute();
        System.out.println("Artista guardado con éxito: " + artista.getNombreArtistico());
    }

    public void actualizarArtista(Artista artista) {
        // Lógica para actualizar un artista en la base de datos utilizando el DSLContext o la conexión a la base de datos
        // Ejemplo (usando sintaxis pseudo-código):
        // query.update("tabla_artista").set("genero", artista.getGenero()).where("id = ?", artista.getId()).execute();
        System.out.println("Artista actualizado con éxito: " + artista.getNombreArtistico());
    }

    public void eliminarArtista(Artista artista) {
        // Lógica para eliminar un artista de la base de datos utilizando el DSLContext o la conexión a la base de datos
        // Ejemplo (usando sintaxis pseudo-código):
        // query.delete("tabla_artista").where("id = ?", artista.getId()).execute();
        System.out.println("Artista eliminado con éxito: " + artista.getNombreArtistico());
    }

    // Otros métodos DAO para obtener artistas, realizar consultas, etc.
}