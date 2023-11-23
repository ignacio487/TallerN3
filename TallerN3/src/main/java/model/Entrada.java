package model;

public class Entrada {
    private String tipo;
    private double precio;
    private int cantidadDisponible;
    private EventoMusical evento;

    public Entrada(String tipo, double precio, int cantidadDisponible, EventoMusical evento) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.evento = evento; // Asignación del evento pasado como argumento al constructor
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public EventoMusical getEvento() {
        return evento;
    }

    public void venderEntradas(int cantidad) {
        if (cantidad <= cantidadDisponible && cantidad > 0) {
            cantidadDisponible -= cantidad;
            System.out.println("Se vendieron " + cantidad + " entradas de tipo " + tipo + " para el evento " + evento.getNombreEvento());
        } else {
            System.out.println("No hay suficientes entradas disponibles de tipo " + tipo);
        }
    }
}