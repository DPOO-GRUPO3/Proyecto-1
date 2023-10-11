package model;

public class Temporada {
	
public static int numeroTemporadas;
private int idTemporada;
private int fechaInicio;
private int fechaFin;
private double tarifaTemporada;


public Temporada(int fechaInicio,int fechaFin,double tarifaTemporada) {
	this.tarifaTemporada=tarifaTemporada;
	this.fechaInicio=fechaInicio;
	this.fechaFin=fechaFin;
	numeroTemporadas++;
	this.idTemporada=numeroTemporadas;
			
	
}
public void setID(int id) {
	this.idTemporada=id;
}
public int getInicioTemporada() {
	return fechaInicio;
}
public int getFinTemporada() {
	return fechaFin;
}
public double getTarifaTemporada() {
	return tarifaTemporada;
}
public int getIdTemporada() {
	return idTemporada;
}

}
