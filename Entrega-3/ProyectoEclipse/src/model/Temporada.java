package model;

import java.time.LocalDateTime;

public class Temporada {
	
public static int numeroTemporadas;
private int idTemporada;
private LocalDateTime fechaInicio;
private LocalDateTime fechaFin;
private double tarifaTemporada;
private Categoria categoria;


public Temporada(LocalDateTime fechaInicio,LocalDateTime fechaFin,double tarifaTemporada) {
	this.tarifaTemporada=tarifaTemporada;
	this.fechaInicio=fechaInicio;
	this.fechaFin=fechaFin;
	numeroTemporadas++;
	this.idTemporada=numeroTemporadas;
			
	
}
public void setID(int id) {
	this.idTemporada=id;
}
public LocalDateTime getInicioTemporada() {
	return fechaInicio;
}
public LocalDateTime getFinTemporada() {
	return fechaFin;
}
public double getTarifaTemporada() {
	return tarifaTemporada;
}
public int getIdTemporada() {
	return idTemporada;
}

public void setCategoria(Categoria categoria)
{
	this.categoria=categoria;
}
public Categoria getCategoria()
{
	return categoria;
}

}
