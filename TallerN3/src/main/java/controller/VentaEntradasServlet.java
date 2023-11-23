package controller;

import model.Entrada;
import model.EventoMusical;
import model.data.dao.EntradaDAO;
import org.jooq.DSLContext;

public class VentaEntradasServlet {
    private EntradaDAO entradaDAO;

    public VentaEntradasServlet(DSLContext query) {
        this.entradaDAO = new EntradaDAO(query);
    }

    public void venderEntradas(DSLContext query, EventoMusical evento, String tipoEntrada, double precio, int cantidad) {
        Entrada entrada = new Entrada(tipoEntrada, precio, cantidad, evento);

        try {
            if (entrada != null) {
                entradaDAO.venderEntrada(query, entrada);
                System.out.println("Entradas vendidas para el evento: " + evento.getNombreEvento());
            } else {
                System.out.println("Error: Intento de venta de entradas fallido");
            }
        } catch (Exception e) {
            System.out.println("Error al intentar vender entradas: " + e.getMessage());
            e.printStackTrace(); // Esta línea mostrará detalles completos de la excepción en la consola para ayudar en la depuración.
        }
    }
}