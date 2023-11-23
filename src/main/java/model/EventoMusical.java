package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventoMusical {
    private String nombreEvento;
    private Date fecha;
    private String lugar;
    private Artista artista;
    private List<Asistente> asistentes;

    public EventoMusical(String nombreEvento, Date fecha, String lugar, Artista artista) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.artista = artista;
        this.asistentes = new ArrayList<>();
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void agregarAsistente(Asistente asistente) {
        asistentes.add(asistente);
    }
}