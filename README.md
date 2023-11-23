Se debe desarrollar un sistema web para la organizacion y venta de entradas para eventos musicales de la empresa "Global Music Events".
Este Taller sera desarrollado en modalidad de parejas por Martin Mardones e Ignacio Riquelme
Para el desarrollo de este sistema debemos crear 4 packages los cuales son
1: model, el cual tendria las clases 
-EventoMusical
-Entrada
-Asistente
-Artista
2: data, este package se encontraria dentro del package anterior y tendria las siguientes clases
-DBConnector
-DBGenerator
3: dao, este package al igual que el anterior tambien se encontraria dentro de model y a la vez dentro del package data, este tendria las clases
-ArtistaDAO
-AsistenteDAO
-EntradaDAO
-EventoDAO
4: controller, este package esta separado de los demas, pero sus clases tendrian dependencia hacia las clases del package DAO, dichas clases serian
-RegistroArtistaServlet
-RegistroAsistenteServlet
-RegistroEventosServlet
-CancelacionEventoServlet
-VentaEntradasServlet
