package model;

public class Factura {
	
	//Atributos
	
	private int id;
	
	private double pagoAnticipado;
	
	private double total;
	
	private Cliente cliente;
	
	private Alquiler alquiler;
	

	
	//Constructor
	
	public Factura (int id, Cliente cliente, Alquiler alquiler)
	{
		this.id=id;
		this.cliente= cliente;
		this.alquiler= alquiler;
		calcularTotal(alquiler);
		
			
	}
	
	//getters
	
	public int getId()
	{
		return this.id;
	}
	
	public double getPagoAnticipado()
	{
		return this.pagoAnticipado;
	}
	
	public double getTotal()
	{
		return this.total;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	
	public Alquiler getAlquiler()
	{
		return this.alquiler;
	}
	
	
	//Metódo para calcular total
	
	private void calcularTotal(Alquiler alquiler)
	{
		double precioTarifa= alquiler.getTarifa().getTarifaTemporada();
		
		double precioExcedente=0;
		
		if (!(alquiler.getTarifaExcedente().equals(null)))
		{
			 precioExcedente= alquiler.getTarifaExcedente().getPrecioExcedente();
			
		} 
		
		double precioSeguro=0;
		
		if (!(alquiler.getSeguro().equals(null)))
		{
			 precioSeguro= alquiler.getSeguro().getPrecio();
			
		} 
		
		this.total= precioTarifa + precioExcedente + precioSeguro;
		
		this.pagoAnticipado= total* 0.3;
		
	}

}
