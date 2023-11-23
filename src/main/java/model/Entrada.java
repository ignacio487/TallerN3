package model;

public class Entrada {
    private String tipo;
    private double precio;
    private int cantidadDisponible;
    private EventoMusical evento;
    private EventoMusical getEvento(){
        return new evento();
    }


    public Entrada(String tipo, double precio, int cantidadDisponible, EventoMusical evento) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.evento = evento; // Asignación del evento pasado como argumento al constructor
    }

    // Getters y Setters para tipo, precio, cantidadDisponible y evento

    public void venderEntradas(int cantidad) {
        if (cantidad <= cantidadDisponible && cantidad > 0) {
            cantidadDisponible -= cantidad;
            System.out.println("Se vendieron " + cantidad + " entradas de tipo " + tipo);
        } else {
            System.out.println("No hay suficientes entradas disponibles de tipo " + tipo);
        }
    }
}