package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Sede {
	
	//Atributos
	
	private String nombre;
	
	private String ubicacion;
	
	private LocalTime inicio;
	
	private LocalTime fin;
	
	private ArrayList<Carro> Carros;
	
	//Constructor
	
	public Sede (String nombre, String ubicacion, LocalTime inicio, LocalTime fin)
	{
		this.nombre = nombre;
		this.ubicacion= ubicacion;
		this.inicio = inicio;
		this.fin = fin;
		this.Carros = new ArrayList<Carro>();
		
	}
	
	//Métodos consultar información
	
	public String getNombre()
	//getters
	
	public String getNombre()
	//getters
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getUbicacion()
	{
		return this.ubicacion;
	}
	
	public LocalTime getInicio()
	{
		return this.inicio;
	}
	
	public LocalTime getFin()
	{
		return this.fin;
	}
	
	public ArrayList<Carro> getCarro()
	{ 
		return this.Carros;
	}
	
	//setters
	
	public void setCarro(Carro carro)
	{
		
	}
	
	
	
	

}
