package model;

public class Categoria {
// Atributos
	private String nombreCat;
	private double tarifaCat;
	
	public Categoria(String nombreCat, Double tarifaAsociada) {
		this.nombreCat=nombreCat;
		this.tarifaCat=tarifaAsociada;
	}
	public String getNombre() {
	return nombreCat;
	
}
	public double tarifaCat() {
		return tarifaCat;
	}
	}

