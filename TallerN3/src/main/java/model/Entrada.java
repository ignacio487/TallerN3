package model;

public class Entrada {
    private String tipo;
    private double precio;
    private int cantidadDisponible;
    private Asistente comprador;
    private EventoMusical evento;

    public Entrada(String tipo, double precio, int cantidadDisponible) {
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.evento=getEvento();
    }

    private EventoMusical getEvento() {
        return new EventoMusical();
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }


    public void venderEntradas(int cantidad) {
        if (cantidad <= cantidadDisponible && cantidad > 0) {
            cantidadDisponible -= cantidad;
            System.out.println("Se vendieron " + cantidad + " entradas de tipo " + tipo);
        } else {
            System.out.println("No hay suficientes entradas disponibles de tipo " + tipo);
        }
    }
}