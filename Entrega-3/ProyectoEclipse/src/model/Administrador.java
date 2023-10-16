package model;

public class Administrador implements Usuario {
	
    private String nombreUsuario;
    private String contrasena;
    private boolean sesionIniciada;

    public Administrador(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
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
	
	public Sede getSede()
	{
		return this.sede;
				
	}


    /*
     * Inicion de sesion
     * */

    
}







