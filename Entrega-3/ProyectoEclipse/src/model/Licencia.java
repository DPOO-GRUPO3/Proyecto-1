package model;
//Llenar con atributos y getters unicamente
public class Licencia {
private String numero;
private String pais;
private String fechaVens;
private String rutaImagen;

public Licencia(String cedula,String numero,String pais,String
		fechaVens,String rutaImagen) {

	this.fechaVens=fechaVens;
	this.numero=numero;
	this.pais=pais;
	this.rutaImagen=rutaImagen;	
}

public String getFechaVens() {
	return fechaVens;
}
public String getNumero() {
	return numero;
}
public String getPais() {
	return pais;
}
public String getRutaImagen() {
	return rutaImagen;
}
}
