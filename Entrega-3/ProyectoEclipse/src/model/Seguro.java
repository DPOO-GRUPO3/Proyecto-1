package model;

public class Seguro {
	
	// Atributos
	
	private String nombre;
	
	private int id;
	
	private double precio;
	
	public Seguro( String nombre, int id, double precio)
	{
		this.nombre= nombre;
		this.id= id;
		this.precio= precio;
	}
	
	//getters
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public double getPrecio()
	{
		return this.precio;
	}
	
	//setters
	
	public void setPrecio(double precio)
	{
		this.precio= precio;
	}
	
	
}
