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
public HashMap<String, Sede> getMapaSedes(){
	return mapaSedes;
}

public HashMap<String, Alquiler> getMapaAlquileres(){
	return mapaAlquileres;
}

public HashMap<String, Empleado> getMapaEmpleados(){
	return mapaEmpleados;
}

public HashMap<String, Tarifa> getMapaTarifas(){
	return mapaTarifasExcedente;
}

public HashMap<String, Seguro> getMapaSeguros(){
	return mapaSeguros;
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



//SEGUNDO OBJETO: TARJETA

//READ: Descargar todas las tarjetas

private void crearMapaTarjetas() {
BufferedReader br = new BufferedReader(new FileReader("./data/tarjetas.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String numero = partes[0];
	Tarjeta tarjeta=reader.descomprimirTarjeta(linea);
	mapaTarjetas.put(numero, tarjeta);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoTarjetas(){
	String texto="";
	for(Tarjeta tarjeta:mapaTarjetas.values()) {
		texto+=writer.comprimirTarjeta(tarjeta);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoTarjetas() {
	String texto=generarTextoTarjetas();
	FileWriter fichero = new FileWriter("./data/tarjetas.txt");
	fichero.write(texto);
	fichero.close();
}

//TERCER OBJETO: LICENCIA

//READ: Descargar todas las licencias

private void crearMapaLicencias() {
BufferedReader br = new BufferedReader(new FileReader("./data/licencias.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String numero = partes[1];
	Licencia licencia=reader.descomprimirLicencia(linea);
	mapaLicencias.put(numero, licencia);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoLicencias(){
	String texto="";
	for(Licencia licencia:mapaLicencias.values()) {
		texto+=writer.comprimirLicencia(licencia);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoLicencias() {
	String texto=generarTextoLicencias();
	FileWriter fichero = new FileWriter("./data/licencias.txt");
	fichero.write(texto);
	fichero.close();
}

//CUARTO OBJETO: CATEGORIA

//READ: Descargar todas las categorias

private void crearMapaCategorias() {
BufferedReader br = new BufferedReader(new FileReader("./data/categorias.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String nombre = partes[0];
	Categoria categoria=reader.descomprimirCategoria(linea);
	mapaCategorias.put(nombre, categoria);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoCategorias(){
	String texto="";
	for(Categoria categoria:mapaCategorias.values()) {
		texto+=writer.comprimirCategoria(categoria);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoCategorias() {
	String texto=generarTextoCategorias();
	FileWriter fichero = new FileWriter("./data/categorias.txt");
	fichero.write(texto);
	fichero.close();
}

//QUINTA CATEGORÍA: CLIENTE

//READ: Descargar todas las clientes

private void crearMapaClientes() {
BufferedReader br = new BufferedReader(new FileReader("./data/clientes.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String usuario = partes[0];
	Cliente cliente=reader.descomprimirCliente(linea, mapaLicencias, mapaTarjetas);
	mapaClientes.put(usuario, cliente);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoClientes(){
	String texto="";
	for(Cliente cliente:mapaClientes.values()) {
		texto+=writer.comprimirCliente(cliente);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoClientes() {
	String texto=generarTextoClientes();
	FileWriter fichero = new FileWriter("./data/clientes.txt");
	fichero.write(texto);
	fichero.close();
}

//SEXTO OBJETO: SEDE

//READ: Descargar todas las sedes

private void crearMapaSedes() {
BufferedReader br = new BufferedReader(new FileReader("./data/sedes.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String nombre = partes[0];
	Sede sede=reader.descomprimirSede(linea);
	mapaSedes.put(nombre, sede);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoSedes(){
	String texto="";
	for(Sede sede:mapaSedes.values()) {
		texto+=writer.comprimirSede(sede);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoSedes() {
	String texto=generarTextoSedes();
	FileWriter fichero = new FileWriter("./data/sedes.txt");
	fichero.write(texto);
	fichero.close();
}

//SEPTIMO OBJETO: CARRO

//READ: Descargar todas las reservas

private void crearMapaCarros() {
BufferedReader br = new BufferedReader(new FileReader("./data/carros.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String placa = partes[0];
	Carro carro = reader.descomprimirCarro(linea, mapaSedes, mapaCategorias);
	mapaCarros.put(placa,carro );
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoCarros(){
	String texto="";
	for(Carro carro:mapaCarros.values()) {
		texto+=writer.comprimirCarro(carro);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoCarros() {
	String texto=generarTextoCarros();
	FileWriter fichero = new FileWriter("./data/carro.txt");
	fichero.write(texto);
	fichero.close();
}

//OCTAVO OBJETO: RESERVA

//READ: Descargar todas las reservas

private void crearMapaReservas() {
BufferedReader br = new BufferedReader(new FileReader("./data/reservas.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String id = partes[0];
	Reserva reserva = reader.descomprimirReserva(linea, mapaSedes, mapaCategorias, mapaCarros, mapaClientes);
	mapaReservas.put(id, reserva);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoReservas(){
	String texto="";
	for(Reserva reserva:mapaReservas.values()) {
		texto+=writer.comprimirReserva(reserva);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoReservas() {
	String texto=generarTextoReservas();
	FileWriter fichero = new FileWriter("./data/reservas.txt");
	fichero.write(texto);
	fichero.close();
}

//NOVENO OBJETO: ALQUILER

//READ: Descargar todas las alquileres

private void crearMapaAlquileres() {
BufferedReader br = new BufferedReader(new FileReader("./data/alquileres.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String id = partes[0];
	Alquiler alquiler = reader.descomprimirAlquiler(linea, mapaSedes, mapaCategorias, mapaLicencias, mapaCarros, mapaClientes, mapaSeguros, mapaTarifasExcedente, mapaTemporadas, mapaReservas);
	mapaAlquileres.put(id, alquiler);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoAlquileres(){
	String texto="";
	for(Alquiler alquiler:mapaAlquileres.values()) {
		texto+=writer.comprimirAlquiler(alquiler);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoAlquileres() {
	String texto=generarTextoAlquileres();
	FileWriter fichero = new FileWriter("./data/alquileres.txt");
	fichero.write(texto);
	fichero.close();
}

//DECIMO OBJETO: EMPLEADO

//READ: Descargar todas las alquileres

private void crearMapaEmpleados() {
BufferedReader br = new BufferedReader(new FileReader("./data/empleados.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String usuario = partes[2];
	Empleado empleado = reader.descomprimirEmpleado(linea, mapaSedes, mapaEmpleados);
	mapaEmpleados.put(usuario, empleado);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoEmpleados(){
	String texto="";
	for(Empleado empleado:mapaEmpleados.values()) {
		texto+=writer.comprimirEmpleado(empleado);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoEmpleados() {
	String texto=generarTextoEmpleados();
	FileWriter fichero = new FileWriter("./data/empleados.txt");
	fichero.write(texto);
	fichero.close();
}

//UNDECIMO OBJETO: SEGURO

//READ: Descargar todas las seguros

private void crearMapaSeguros() {
BufferedReader br = new BufferedReader(new FileReader("./data/seguros.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String nombre = partes[0];
	Seguro seguro = reader.descomprimirSeguro(linea);
	mapaSeguros.put(nombre, seguro);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoSeguros(){
	String texto="";
	for(Seguro seguro:mapaSeguros.values()) {
		texto+=writer.comprimirSeguro(seguro);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoSeguros() {
	String texto=generarTextoSeguros();
	FileWriter fichero = new FileWriter("./data/seguros.txt");
	fichero.write(texto);
	fichero.close();
}

//DOCEAVO OBJETO: TARIFA

//READ: Descargar todas las tarifas de excedentes

private void crearMapaTarifas() {
BufferedReader br = new BufferedReader(new FileReader("./data/tarifasExcedentes.txt"));

String linea = br.readLine();

while (linea != null) {
	String[] partes = linea.split(";");
	String id = partes[0];
	Tarifa tarifa = reader.descomptimirTarifaExcedente(linea);
	mapaTarifasExcedente.put(id, tarifa);
	linea = br.readLine();
}
br.close();
}
//Write: Actualizar archivo, reescribirlo.

private String generarTextoTarifas(){
	String texto="";
	for(Tarifa tarifa:mapaTarifasExcedente.values()) {
		texto+=writer.comprimirTarifa(tarifa);
		texto+="\n";
	}
	return texto;
}
private void actualizarArchivoTarifas() {
	String texto=generarTextoTarifas();
	FileWriter fichero = new FileWriter("./data/tarifasExcedentes.txt");
	fichero.write(texto);
	fichero.close();
}

//Descargar todos los datos

public void deacargarTodoslosDatos() {
	crearMapaTemporadas();
	crearMapaTarjetas();
	crearMapaLicencias();
	crearMapaCategorias();
	crearMapaClientes();
	crearMapaSedes();
	crearMapaCarros();
	crearMapaReservas();
	crearMapaAlquileres();
	crearMapaEmpleados();
	crearMapaSeguros();
	crearMapaTarifas();
	
}
}

