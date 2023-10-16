package controller;

import java.io.IOException;

import model.Administrador;
//import java.util.HashMap;
//import controller.BaseDatos;

public class ControllerAdministrador {
	
	
	private Administrador administrador;
	private BaseDatos datos;
	
	public void setDatos(BaseDatos datos) {
		this.datos=datos;
	}
	
	public Administrador getAdministrador() {
		return this.administrador;
	}
	
	public void LogIn(String usuario,String contrasena) {
		Administrador administrador = datos.getMapaAdministradores().get(usuario);
		if(administrador.equals(null)==false) {
			String password= administrador.getContrasena();
			if(password.equals(contrasena)==true) {
				this.administrador=administrador;
			}
			else {
				
			}
	}	
		else {
			System.out.println("Error al ingresar");
		}
	}
		
		
	/*
	 * setters 
	 * */



	public static void agregarEmpleado(String id, String nombre, String login, String password, String email, String sede ) throws Exception {
		agregarEmpleado(id, nombre, login, password, email, sede);
	}
	
	public static void agregarVehiculo(String placa, String marca, String modelo,String color, String tipoTransmision) throws Exception {
		agregarVehiculo(placa, marca, modelo, color,tipoTransmision);
	}
	
	public void actualizarDatos() throws IOException {
		datos.cargarTodosLosDatos();
	}

}
