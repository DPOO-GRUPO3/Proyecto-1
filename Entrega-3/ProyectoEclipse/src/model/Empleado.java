package model;

public class Empleado implements Usuario {
	
	//Atributos
	
	private String id;
	
	private String nombre;
	
	private String usuario;
	
	private String contraseña;
	
	private String email;
	
	private Sede sede;
	
	public Empleado(String id, String nombre, String usuario, String contraseña, String email)
	{
		this.id= id;
		this.nombre=nombre;
		this.usuario= usuario;
		this.contraseña=contraseña;
		this.email=email;
				
	}
	
	//getters
	
	public String getId()
	{
		return this.id;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getUsuario()
	{
		return this.usuario;
		
	}
	
	public String getContrasena()
	{
		return this.contraseña;
	}
	
	public Sede getSede()
	{
		return this.sede;
				
	}
	
	public void setSede(Sede sede)
	{
		this.sede= sede;
	}

	
	

}
