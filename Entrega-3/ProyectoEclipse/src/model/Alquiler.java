package model;
//
import java.util.ArrayList;

public class Alquiler {
//Métodos
	private Cliente cliente;
	private String fechaDeb;
	private Sede sedeDevolucion;
	private ArrayList<Licencia> licencias;
	public static double tarifaTemporada;
	
	public Alquiler(Cliente cliente,String fechaDeb,Cede cedeDevolucion) {
		this.cliente=cliente;
		this.fechaDeb=fechaDeb;
		this.sedeDevolucion=sedeDevolucion;
		this.licenciasConductores = new ArrayList<Licencia>();
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Sede getSedeDevolucion() {
		return sedeDevolucion;}
	}
	public String getFechaDeb() {
		return fechaDeb;
	}
	public ArrayList<Licencia> getLicencias(){
		return licencias;
	}
	public void anadirLicencia(Licencia licencia) {
		this.licencias.add(licencia);
	}
}
