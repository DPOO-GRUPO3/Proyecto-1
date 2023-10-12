package controller;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Cliente;
import model.Empleado;
import model.Licencia;
import model.Reserva;
import model.Sede;
import model.Seguro;
import model.Tarifa;
import model.Tarjeta;
import model.Temporada;
import controller.Writer;
public class BaseDatos{
	
//Los atributos son los distintos maps que la forman
//
private HashMap<String,Carro> mapaCarros; //mapa carros por placa
private HashMap<String,Reserva> mapaReservas; //mapa reservas por id
private HashMap<String,Categoria> mapaCategorias;//mapa categorias por nombre
private HashMap<String,Temporada> mapaTemporadas;
private HashMap<String,Sede> mapaSedes;//mapa sedes por nombre
private HashMap<String,Seguro> mapaSeguros;//mapa seguros por id
private HashMap<String,Tarifa> mapaTarifasExcedente;//mapa tarivas por id
//USUARIOS
private HashMap<String, Alquiler> mapaAlquileres;// mapa alquileres por id
private HashMap<String,Cliente> mapaClientes; //mapa clientes por login
private HashMap<String,Empleado> mapaEmpleados; //mapa empleados por login
private HashMap<String, Admin> mapaAdmins; //mapa administradpres
private HashMap<String, Licencia> mapaLicencias; //mapa licencias por numero de licencia
private HashMap<String, Tarjeta> mapaTarjetas; //mapa tarjetas por número

// writer
private Writer writer=new Writer();

//REader
private Reader reader =new Reader();
//Metodos
public BaseDatos() {
	this.mapaAdmins=new HashMap<>();
	this.mapaAlquileres= new HashMap<>();
	this.mapaCarros= new HashMap<>();
	this.mapaCategorias=new HashMap<>();
	this.mapaClientes=new HashMap<>();
	this.mapaEmpleados=new HashMap<>();
	this.mapaLicencias=new HashMap<>();
	this.mapaReservas=new HashMap<>();
	this.mapaSedes=new HashMap<>();
	this.mapaTarjetas=new HashMap<>();
	this.mapaTemporadas=new HashMap<>();
}
public HashMap<String, Licencia> getMapaLicencias(){
	return mapaLicencias;
}
public HashMap<String, Tarjeta> getMapaTarjetas(){
	return mapaTarjetas;
}
public HashMap<String, Carro> getMapaCarros(){
	return mapaCarros;
}
public HashMap<String, Cliente> getMapaClientes(){
	return mapaClientes;
}
public HashMap<String, Categoria> getMapaCateg(){
	return mapaCategorias;
}
// PRIMER OBJETO: TEMPORADA:
//READ: DEscargar todas las temporadas
private void crearMapaTemporadas() {
BufferedReader br = new BufferedReader(new FileReader("./data/temporadas.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String id = partes[0];
	Temporada temp=reader.descomprimirTemporada(linea);
	mapaTemporadas.put(id, temp);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.
private String generarTextoTemporadas(){
	String texto="";
	for(Temporada temp:mapaTemporadas.values()) {
		texto+=writer.comprimirTemporada(temp);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoTemporadas() {
	String texto=generarTextoTemporadas();
	FileWriter fichero = new FileWriter("./data/temporadas.txt");
	fichero.write(texto);
	fichero.close();
}
public void deacargarTodoslosDatos() {
	crearMapaTemporadas();
	//terminen esto
}
}

