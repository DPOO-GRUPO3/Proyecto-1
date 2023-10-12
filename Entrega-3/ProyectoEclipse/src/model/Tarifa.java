package model;

import java.time.LocalDate;

public class Tarifa {
	
	//Atributos
	
	private String id;
	
	private int num=0;
	
	private double precioExcedente;

	private LocalDate fechaInicio;
	
	private LocalDate fechaFin;
	
	//Constructor
	
	public Tarifa ( double precioExcedente, LocalDate fechaInicio,LocalDate fechaFin )
	{
		num++;
		this.id= String.valueOf(num);
		this.precioExcedente= precioExcedente;
		this.fechaInicio= fechaInicio;
		this.fechaFin= fechaFin;
	}
	
	//getters
	
	public String getId()
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

