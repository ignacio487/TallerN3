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
        Entrada entrada = new Entrada(tipoEntrada, precio, cantidad, evento); // Ajuste en la creación de la entrada
        // Aquí podrías incluir validaciones adicionales antes de vender las entradas
        if (entrada != null) {
            entradaDAO.venderEntrada(query, entrada); // Llamada al método venderEntrada en EntradaDAO para registrar la venta de entradas
            System.out.println("Entradas vendidas para el evento: " + evento.getNombreEvento());
            // Aquí podrías incluir lógica adicional, como actualización de inventario, registro de la transacción, etc.
        } else {
            System.out.println("Error: Intento de venta de entradas fallido");
        }
    }
}