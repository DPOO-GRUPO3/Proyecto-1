package model;

import java.util.ArrayList;

public class Categoria {
// Atributos
	private String nombreCat;
	private double tarifaCat;
	private Temporada tarifa;
	private Tarifa tarifaExcedente;
	private ArrayList<Carro> carros;
	
	public Categoria(String nombreCat, double tarifaAsociada) {
		this.nombreCat=nombreCat;
		this.tarifaCat=tarifaAsociada;
		this.carros= new ArrayList<Carro>();
	}
	
	//getters
	public String getNombre() {
	return nombreCat;
	
}
	public double tarifaCat() {
		return tarifaCat;
	}
	
	public Tarifa getTarifaExcedente()
	{
		return this.tarifaExcedente;
	}
	
	public Temporada getTarifa()
	{
		return this.tarifa;
	}
	
	public ArrayList<Carro> getCarros()
	{
		return this.carros;
	}
	
	
	//setters
	
	public void setTarifa(Temporada tarifa)
	{
		this.tarifa=tarifa;
	}
	
	public void setTarifaExcedente(Tarifa tarifaExcedente)
	{
		this.tarifaExcedente=tarifaExcedente;
	}
	
	public void setCarro(Carro carro)
	{
		this.carros.add(carro);
	}
	
	
	}

