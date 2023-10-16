package model;

public class Administrador implements Usuario {
	
	private String id;
	
	private String nombre;
	
	private String usuario;
	
	private String contrasena;
	
	private Sede sede;

    public Administrador(String id, String nombreUsuario, String contrasena, String nombre) {
    	this.id = id;
        this.usuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        
    }
    
    
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
		return this.contrasena;
		
	}
	
	
	public Sede getSede()
	{
		return this.sede;
				
	}


    /*
     * Inicion de sesion
     * */

    
}







