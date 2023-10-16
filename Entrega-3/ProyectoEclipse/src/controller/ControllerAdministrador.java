package controller;

import model.Administrador;

public class ControllerAdministrador {
	private Administrador administrador;
	private BaseDatos datos;
	
	public void setDatos(BaseDatos datos) {
		this.datos=datos;
	}
	
	public void LogIn(String usuario,String contrasena) {
		Administrador administrador = datos.getMapaAdministradores().get(usuario);
		if(administrador.equals(null)==false) {
			String contr=administrador.getContrasena();
			if(contr.equals(contrasena)==true) {
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



	public Object getAdministrador() {
		// TODO Auto-generated method stub
		return null;
	}

	public double crearReserva(String nombreCat, String sedeRec, String timeRecoger, String sedeFin, String timeFin) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void actualizarDatos() {
		// TODO Auto-generated method stub
		
	}
	
	public static void agregarEmpleado(String id, String nombre, String login, String password, String email, String sede ) throws Exception {
		agregarEmpleado(id, nombre, login, password, email, sede);
	}
	
	public static void agregarVehiculo(String placa, String marca, String modelo,String color, String tipoTransmision) throws Exception {
		agregarVehiculo(placa, marca, modelo, color,tipoTransmision);
	}

}
