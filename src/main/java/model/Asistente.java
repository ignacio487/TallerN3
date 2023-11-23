package model;

import java.util.ArrayList;

public class Asistente {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String preferenciasMusicales;
    private ArrayList<EventoMusical> eventos;


    public Asistente(String nombre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.preferenciasMusicales = preferenciasMusicales;
        this.eventos = new ArrayList<EventoMusical>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPreferenciasMusicales() {
        return preferenciasMusicales;
    }

    public void setPreferenciasMusicales(String preferenciasMusicales) {
        this.preferenciasMusicales = preferenciasMusicales;
    }


}