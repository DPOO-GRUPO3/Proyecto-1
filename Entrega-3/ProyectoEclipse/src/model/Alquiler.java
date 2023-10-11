package model;
import java.time.LocalTime;
//
import java.util.ArrayList;

public class Alquiler {
	// Métodos
	
	private Cliente cliente;
	
	private LocalTime fechaDeb;
	
	private Sede sedeDevolucion;
	
	private Sede sedeRecoger;
	
	private ArrayList<Licencia> licencias;
	
	

	public Alquiler(Cliente cliente, LocalTime fechaDeb,Sede sedeRecoger, Sede sedeDevolucion) 
	{
		this.cliente = cliente;
		this.fechaDeb = fechaDeb;
		this.sedeDevolucion = sedeDevolucion;
		this.sedeRecoger= sedeRecoger;
		this.licencias = new ArrayList<Licencia>();
	}

	public Cliente getCliente() 
	{
		return cliente;
	}

	public Sede getSedeDevolucion() 
	{
		return sedeDevolucion;
	}
	
	public Sede getSedeRecoger() 
	{
		return sedeDevolucion;
	}

	public LocalTime getFechaDeb() 
	{
		return fechaDeb;
	}

	public ArrayList<Licencia> getLicencias() {
		return licencias;
	}

	public void setLicencia(Licencia licencia) {
		this.licencias.add(licencia);
	}
}
