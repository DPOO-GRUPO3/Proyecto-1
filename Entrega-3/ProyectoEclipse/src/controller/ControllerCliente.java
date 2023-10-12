package controller;

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

}
