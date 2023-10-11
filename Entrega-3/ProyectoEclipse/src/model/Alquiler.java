package model;
import java.time.LocalDate;
import java.time.LocalTime;
//
import java.util.ArrayList;

public class Alquiler {
	// Métodos
	
	private int id;
	
	private Cliente cliente;
	
	private LocalDate fechaDeb;
	
	private Sede sedeDevolucion;
	
	private Sede sedeRecoger;
	
	private ArrayList<Licencia> licencias;
	
	private Tarifa tarifaExcedente;
	
	private Temporada tarifa;
	
	private Seguro seguro;
	
	private Carro carro;
	
	

	public Alquiler(int id,Cliente cliente, LocalDate fechaDeb,Sede sedeRecoger, Sede sedeDevolucion, Carro carro) 
	{
		this.id= id;
		this.cliente = cliente;
		this.fechaDeb = fechaDeb;
		this.sedeDevolucion = sedeDevolucion;
		this.sedeRecoger= sedeRecoger;
		this.licencias = new ArrayList<Licencia>();
		this.carro = carro;
	}
	

	//getters
	public int getAlquileresId()
	{
		return this.id;
	}
	
	public Cliente getCliente() 
	{
		return this.cliente;
	}

	public Sede getSedeDevolucion() 
	{
		return this.sedeDevolucion;
	}
	
	public Sede getSedeRecoger() 
	{
		return this.sedeRecoger;
	}

	public LocalDate getFechaDeb() 
	{
		return this.fechaDeb;
	}

	public ArrayList<Licencia> getLicencias() {
		return this.licencias;
	}
	
	public Tarifa getTarifaExcedente()
	{
		return this.tarifaExcedente;
	}
	
	public Temporada getTarifa()
	{
		return this.tarifa;
	}
	
	public Seguro getSeguro()
	{
		return this.seguro;
	}
	
	public Carro getCarro()
	{
		return this.carro;
	}
	//setters

	public void setLicencia(Licencia licencia) {
		this.licencias.add(licencia);
	}
	
	public void setTarifaExcedente(Tarifa tarifaExcedente)
	{
		this.tarifaExcedente= tarifaExcedente;
	}
	
	public void setTarifa(Temporada tarifa)
	{
		this.tarifa= tarifa;
	}
	
	public void setSeguro(Seguro seguro)
	{
		this.seguro=seguro;
	}
}
