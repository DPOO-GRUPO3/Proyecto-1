package model;

import java.time.LocalTime;

public class Sede {
	
	//Atributos
	
	private String nombre;
	
	private String ubicacion;
	
	private LocalTime inicio;
	
	private LocalTime fin;
	
	//Constructor
	
	public Sede (String nombre, String ubicacion, LocalTime inicio, LocalTime fin)
	{
		this.nombre = nombre;
		this.ubicacion= ubicacion;
		this.inicio = inicio;
		this.fin = fin;
		
	}
	
	//Métodos consultar información
	
	public String getNombre()
	{
		return nombre;
	}
	
	String getUbicacion()
	{
		return this.ubicacion;
	}
	
	LocalTime getInicio()
	{
		return this.inicio;
	}
	
	LocalTime getFin()
	{
		return this.fin;
	}
	
	
	

}
