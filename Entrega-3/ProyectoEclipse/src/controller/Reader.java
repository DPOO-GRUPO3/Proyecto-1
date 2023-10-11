package controller;

import java.time.LocalTime;
import java.util.HashMap;

import model.Categoria;
import model.Cliente;
import model.Licencia;
import model.Sede;
import model.Tarjeta;
import model.Temporada;

public class Reader {
//Convierte String estandar en objeto. Va construyento el objeto.
//IMPORTANTE EL ORDEN EN QUE SE CARGAN LOS DATOS.

//PRIMER OBJETO: TEMPORADA
public Temporada descomprimirTemporada(String linea) {
	String[] partes = linea.split(";");
	int id = Integer.parseInt(partes[0]);
	int fecha1 = Integer.parseInt(partes[1]);
	int fecha2 = Integer.parseInt(partes[2]);
	double tarifa=Double.parseDouble(partes[3]);
	Temporada temp=new Temporada(fecha1, fecha2, tarifa);
	temp.setID(id);
	return temp;
}
//SEGUNDO OBJETO: TARJETA
public Tarjeta descomprimirTarjeta(String linea) {
	String[] partes = linea.split(";");
	String numero = partes[0];
	String codigo = partes[1];
	String bloqueo = partes[2];
	
	Tarjeta tar=new Tarjeta(numero, codigo);
	if(bloqueo.equals("1")==true) {
		tar.bloquear();
	}
	return tar;
}
//TERCER OBJETO: LICENCIA
public Licencia descomprimirLicencia(String linea) {
	String[] partes = linea.split(";");
	String fechaVens = partes[0];
	String numero = partes[1];
	String pais = partes[2];
	String rutaImagen = partes[3];
	Licencia lic=new Licencia(numero,pais,fechaVens,rutaImagen);
	return lic;
}
// CUARTO OBJETO: CATEGORIA
public Categoria descomprimirCategoria(String linea) {
	String[] partes = linea.split(";");
	String nombre = partes[0];
	double tarifa = Double.parseDouble(partes[1]);
	
	Categoria cat=new Categoria(nombre,tarifa);
	return cat;
}
// QUINTA CATEGORÍA: CLIENTE
public Cliente descomprimirCliente(String linea,HashMap<String, Licencia> mapaLic,
		HashMap<String, Tarjeta> mapaTar) {
	String[] partes = linea.split(";");
	String usuario = partes[0];
	String contrasena = partes[1];
	String email = partes[2];
	String pais=partes[3];
	String nombre=partes[4];
	String rutaImagen=partes[5];
	String numLic=partes[6];
	String numTarjeta=partes[7];
	
	
	Cliente cli=new Cliente( usuario, contrasena, nombre,
			 email,  pais,  rutaImagen);
	cli.setLicencia(mapaLic.get(numLic));
	cli.setTarjeta(mapaTar.get(numTarjeta));
	return cli;
}
// SEXTA CATEGORÍA: SEDE
public Sede descomprimirSede(String linea) {
	String[] partes = linea.split(";");
	String nombre = partes[0];
	String dir= partes[1];
	String inicio = partes[2];
	String fin=partes[3];
	LocalTime in=LocalTime.parse(inicio);
	LocalTime f=LocalTime.parse(fin);
	Sede s=new Sede(nombre, dir, in,  f);
	return s;
}
// SEPTIMA CATEGORÍA: CARRO

}
