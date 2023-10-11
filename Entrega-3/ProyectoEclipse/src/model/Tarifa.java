package model;

import java.time.LocalDate;

public class Tarifa {
	
	//Atributos
	
	private int id;
	
	private double precioExcedente;

	private LocalDate fechaInicio;
	
	private LocalDate fechaFin;
	
	//Constructor
	
	public Tarifa (int id, double precioExcedente, LocalDate fechaInicio,LocalDate fechaFin )
	{
		this.id= id;
		this.precioExcedente= precioExcedente;
		this.fechaInicio= fechaInicio;
		this.fechaFin= fechaFin;
	}
	
	//getters
	
	public int getId()
	{
		return this.id;
	}
	
	public double getPrecioExcedente()
	{
		return this.precioExcedente;
	}
	
	public LocalDate getFechaInicio()
	{
		return this.fechaInicio;
	}
	
	public LocalDate getFechaFin()
	{
		return this.fechaFin;
	}
	
	
}

