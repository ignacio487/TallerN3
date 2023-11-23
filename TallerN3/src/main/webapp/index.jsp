<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.EventoMusical" %>
<%@ page import="model.Asistente" %>
<%@ page import="model.Artista" %>
<%@ page import="model.Entrada" %>
<%@ page import="model.data.dao.EventoDAO" %>
<%@ page import="model.data.dao.AsistenteDAO" %>
<%@ page import="model.data.dao.ArtistaDAO" %>
<%@ page import="model.data.dao.EntradaDAO" %>
<%@ page import="java.util.ArrayList" %>

<%
    // Crear instancias de DAO y obtener datos
    EventoDAO eventoDAO = new EventoDAO(/* DSLContext o conexión a la base de datos */);
    AsistenteDAO asistenteDAO = new AsistenteDAO(/* DSLContext o conexión a la base de datos */);
    ArtistaDAO artistaDAO = new ArtistaDAO(/* DSLContext o conexión a la base de datos */);
    EntradaDAO entradaDAO = new EntradaDAO(/* DSLContext o conexión a la base de datos */);

    // Obtener listas de eventos, asistentes, artistas y entradas
    ArrayList<EventoMusical> eventos = eventoDAO.crearEvento().obtenerEventos);
    ArrayList<Asistente> asistentes = asistenteDAO.guardarAsis();
    ArrayList<Artista> artistas = artistaDAO.obtenerArtistas();
    ArrayList<Entrada> entradas = entradaDAO.obtenerEntradas();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Conciertos y Eventos</title>
    <link rel="stylesheet" href="css/estilos.css">
</head>
<body>

<h1>Conciertos y Eventos</h1>

<!-- Mostrar detalles de eventos -->
<h2>Eventos Musicales</h2>
<ul>
    <% for (EventoMusical evento : eventos) { %>
    <li>
        <%= evento.getNombre() %>
        <form action="comprarEntradas.jsp" method="post">
            <input type="hidden" name="eventoId" value="<%= evento.getId() %>">
            <input type="submit" value="Comprar Entradas">
        </form>
    </li>
    <% } %>
</ul>

<!-- Comprar entradas -->
<h2>Comprar Entradas</h2>
<form action="procesarCompra.jsp" method="post">
    <label>Evento:
        <select name="eventoId">
            <% for (EventoMusical evento : eventos) { %>
            <option value="<%= evento.getId() %>"><%= evento.getNombre() %></option>
            <% } %>
        </select>
    </label>
    <br>
    <label>Cantidad:
        <input type="number" name="cantidad" min="1">
    </label>
    <br>
    <input type="submit" value="Comprar">
</form>

<!-- Gestionar artistas -->
<h2>Gestionar Artistas</h2>
<ul>
    <% for (Artista artista : artistas) { %>
    <li>
        <%= artista.getNombreArtistico() %>
        <form action="gestionarPresentaciones.jsp" method="post">
            <input type="hidden" name="artistaId" value="<%= artista.getId() %>">
            <input type="submit" value="Gestionar Presentaciones">
        </form>
    </li>
    <% } %>
</ul>

</body>
</html>