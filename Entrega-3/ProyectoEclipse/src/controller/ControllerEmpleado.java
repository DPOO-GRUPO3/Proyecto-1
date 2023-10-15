package controller;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Cliente;
import model.Empleado;
import model.Licencia;
import model.Reserva;
import model.Sede;
import model.Seguro;
import model.Tarifa;
import model.Tarjeta;
import model.Temporada;

public class ControllerEmpleado {
	
	//Atributos
	
	private Empleado empleado;
	
	private BaseDatos datos;
	
	private HashMap<String,Carro> mapaCarros; //mapa carros por placa
	private HashMap<String,Reserva> mapaReservas; //mapa reservas por id
	private HashMap<String,Categoria> mapaCategorias;//mapa categorias por nombre
	private HashMap<String,Temporada> mapaTemporadas;
	private HashMap<String,Sede> mapaSedes;//mapa sedes por nombre
	private HashMap<String,Seguro> mapaSeguros;//mapa seguros por id
	private HashMap<String,Tarifa> mapaTarifasExcedente;//mapa tarivas por id
	//USUARIOS
	private HashMap<String, Alquiler> mapaAlquileres;// mapa alquileres por id
	private HashMap<String,Cliente> mapaClientes; //mapa clientes por login
	private HashMap<String,Empleado> mapaEmpleados; //mapa empleados por login
	private HashMap<String, Licencia> mapaLicencias; //mapa licencias por numero de licencia
	private HashMap<String, Tarjeta> mapaTarjetas; //mapa tarjetas por número
	
	
	//Constructor
	
	public ControllerEmpleado(BaseDatos datos)
	{
		this.empleado=null;
		this.datos=datos;
		this.mapaCarros= datos.getMapaCarros();
		this.mapaAlquileres= datos.getMapaAlquileres();
		this.mapaEmpleados=datos.getMapaEmpleados();
	}
	
	
	
	public void getEmpleado(String usuario)
	{
		if (mapaEmpleados.containsKey(usuario))
		{
			this.empleado= mapaEmpleados.get(usuario);
		}
		else {System.out.println("No se encuentra este usuario");}
	}
	
	public boolean verificarContraseña(String contraseña)
	{
		boolean r= false;
		if(empleado.getContrasena().equals(contraseña))
		{
			r= true;
		}
		
		return r;
	}
	
	private Carro Disponibilidad(Sede sede,Categoria categoria, LocalDateTime fechaInicio, LocalDateTime fechaFin)
	{
		for (Carro carro:categoria.getCarros())
		{
			LocalDateTime fechaDisponibilidad = carro.getFechaDispCons();
			ArrayList<Reserva> reservas = carro.getReservas();
			
			for (Reserva reserva:reservas)
			{
				if (!(fechaDisponibilidad.equals(null)))
					{
						
					}
			}
			
		}
		
	}
	
	public void CrearAlquiler(String id, String usuario, String sedeDevolucion, String sedeRecoger,
			String fechaDeb, String fechaInicio, String categoria)
	{
		Cliente objCliente= mapaClientes.get(usuario);
		Sede objSedeDevolucion=mapaSedes.get(sedeDevolucion);
		Sede objSedeRecoger=mapaSedes.get(sedeDevolucion);
		LocalDateTime objFechInicio = LocalDateTime.parse(fechaInicio);
		LocalDateTime objFechDeb = LocalDateTime.parse(fechaDeb);
		Categoria objCategoria = mapaCategorias.get(categoria);
		Temporada tarifa = objCategoria.getTarifa();
		Tarifa tarifaExcedente= null;
		
		
		if (!(sedeDevolucion.equals(sedeRecoger)))
		{
			tarifaExcedente= objCategoria.getTarifaExcedente();
		}
		
		Carro carro = Disponibilidad(objSedeRecoger, objCategoria, fechaInicio, fechaDeb);
		
		
		
	}
	
	

}
