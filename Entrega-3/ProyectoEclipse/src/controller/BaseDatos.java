package controller;
import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Cliente;
import model.Licencia;
import model.Reserva;
import model.Sede;
import model.Tarjeta;
import model.Temporada;
public class BaseDatos {
	
//Los atributos son los distintos maps que la forman
//
private HashMap<String,Carro> mapaCarros; //mapa carros por placa
private HashMap<String,Reserva> mapaReservas; //mapa reservas por id
private HashMap<String,Categoria> mapaCategorias;//mapa categorias por nombre
private HashMap<String,Temporada> mapaTemporadas;
private HashMap<String,Sede> mapaSedes;//mapa sedes por nombre
//USUARIOS
private HashMap<String, Alquiler> mapaAlquileres;// mapa alquileres por id
private HashMap<String,Cliente> mapaClientes; //mapa clientes por login
private HashMap<String,Empleado> mapaEmpleados; //mapa empleados por login
private HashMap<String, Admin> mapaAdmins; //mapa administradpres
private HashMap<String, Licencia> mapaLicencias; //mapa licencias por numero de licencia
private HashMap<String, Tarjeta> mapaTarjetas; //mapa tarjetas por número
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
}
