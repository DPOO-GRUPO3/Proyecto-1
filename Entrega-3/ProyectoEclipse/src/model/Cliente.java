package model;

public class Cliente implements Usuario {

	
	//Atributos
	//login
	private String usuario;
	private String contrasena;
	//datos generales:
	private String nombre;
	private String email;
	private String nacionalidad;
	private String rutaImagenID;
	private String cedula;
	//licencia
	private Licencia licencia;
	//tarjeta
	private Tarjeta tarjeta;
	
	
	public Cliente()
	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {

		return contrasena;
	}

	public String getNombre() {

		return nombre;
	}

}
