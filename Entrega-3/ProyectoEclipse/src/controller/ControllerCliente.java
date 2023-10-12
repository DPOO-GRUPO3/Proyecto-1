package controller;

import java.util.HashMap;

import model.Carro;
import model.Cliente;

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
	int fecha1pedida=Integer.parseInt(timeReco.replace(":","").replace(" ", ""));
	for(Carro carro:mapaCarros.values()) {
		
	}
}
}
