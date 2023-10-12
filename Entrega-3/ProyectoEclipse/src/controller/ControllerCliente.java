package controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import model.Carro;
import model.Categoria;
import model.Cliente;
import model.Reserva;

public class ControllerCliente {
private Cliente cliente;
private BaseDatos datos; // debe haber unos datos asociados para trabajar

// Métodos
//contructoir
public ControllerCliente() {
	this.cliente=null;
	this.datos=null;
	
}
//Get
public Cliente getCliente() {
	return this.cliente;
}
public void setDatos(BaseDatos datos) {
	this.datos=datos;
}
public void logIn(String usuario,String contrasena) {
	Cliente cliente = datos.getMapaClientes().get(usuario);
	if(cliente.equals(null)==false) {
		String contr=cliente.getContrasena();
		if(contr.equals(contrasena)==true) {
			this.cliente=cliente;
		}
		
}

}
public boolean crearReserva(String nombreCategoria, String sedeRec,
		String timeReco, String sedeFin, String timeFin) {
	HashMap<String,Carro> mapaCarros=datos.getMapaCarros();
	//Vamos a iterar el inventario hasta encontrar el primer
	//carro que cumple las características y lo vamos a reservar
	// si se hace la reserva retornamos true, si se itera toda la lista 
	//sin éxito retornamos false
	LocalDateTime fechaPed1=LocalDateTime.parse(timeReco);
	LocalDateTime fechaPed2=LocalDateTime.parse(timeFin);
	
	for(Carro carro:mapaCarros.values()) {
		LocalDateTime fechadisp=carro.getFechaDispCons();
		if(fechadisp.equals(null)==false && fechadisp.isAfter(fechaPed1)) {
			continue; //descartamos el carro por fecha disponibilidad
		}
	
		LocalDateTime entregaAlquiler=carro.getUsoActual().getFechaDeb();
	
		if(entregaAlquiler.isAfter(fechaPed1)==true)  {
				
			continue; //descartamos el carro por estar alquilado
		}
		
		if(hayReservasEnIntervalo(carro,fechaPed1,fechaPed2)==true) {
			continue;
		}
		Categoria categoria=datos.getMapaCateg().get(nombreCategoria);
		Sede sede1=datos
		Reserva reserva=new Reserva(cliente, fechaPed1, fechaPed2,
				
				categoria, carro, null, null);
	}}
	

private boolean hayReservasEnIntervalo(Carro carro,LocalDateTime fecha1,LocalDateTime fecha2) {
	ArrayList<Reserva> reservas=carro.getReservas();
	for (int i=0;i<reservas.size();i++) {
		Reserva reserva=reservas.get(i);
		//Para que no haya reservas en intervalo no debe haber ni una sola interseccion
		boolean inters=hayInterseccionIntervaloReservaConFechas(reserva,
				fecha1,fecha2);
		if(inters==true) {
			return true;
		}
	}
	return false;
}
private boolean hayInterseccionIntervaloReservaConFechas(Reserva reserva,
		LocalDateTime fecha1,LocalDateTime fecha2) {
	LocalDateTime in=reserva.getFechaYHoraInicio();
	LocalDateTime fin=reserva.getFechaYHoraFin();
	//deben pasar 4 cosas y cumplirse siempre
	//1 el inicio del intervalo no debe estar en el intervaloReserva
	if(hayFechaEnIntervalo(fecha1,in,fin)==true) {
		return true;
	}
	//2 el fin del intervalo no debe estar en el intervaloReserva
	if(hayFechaEnIntervalo(fecha2,in,fin)==true) {
		return true;}

// 3 el inicio del intervaloReserva no debe estar en el intervalo
	if(hayFechaEnIntervalo(in,fecha1,fecha2)==true) {
		return true;
	}
	// 4 el fin del intervaloReserva no debe estar en el intervalo
	if(hayFechaEnIntervalo(fin,fecha1,fecha2)==true) {
		return true;
		
	}
	else {
		return false;
	}
}
private boolean hayFechaEnIntervalo(LocalDateTime fecha, LocalDateTime fecha1,
		LocalDateTime fecha2) {
	if(fecha.isAfter(fecha1) && fecha.isBefore(fecha2)) {
		return true;
	}
	else {
		return false;
	}
}
}