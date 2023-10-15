package model;

public class Empleado implements Usuario {
	
	//Atributos
	
	private String id;
	
	private String nombre;
	
	private String usuario;
	
	private String contrase�a;
	
	private String email;
	
	private Sede sede;
	
	public Empleado(String id, String nombre, String usuario, String contrase�a, String email)
	{
		this.id= id;
		this.nombre=nombre;
		this.usuario= usuario;
		this.contrase�a=contrase�a;
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
		return this.contrase�a;
	}
	
	public Sede getSede()
	{
		return this.sede;
				
	}
	
	public void setSede(Sede sede)
	{
		this.sede= sede;
	}

	/*
	 * Metodos inicio de sesion
	 * */ 
	
    //private String usuario;
    //private String contrase�a;
    private boolean sesionIniciada;

    public Empleado(String usuario, String contrase�a) {
        this.usuario = usuario;
        this.contrase�a = contrase�a;
    }

    @Override
    public void iniciarSesion(String nombreUsuario, String contrase�a) {
        if (usuario.equals(this.usuario) && contrase�a.equals(this.contrase�a)) {
            sesionIniciada = true;
            System.out.println("Sesi�n iniciada para el empleado: " + usuario);
        } else {
            System.out.println("Error: Nombre de usuario o contrase�a incorrectos.");
        }
    }

    @Override
    public void cerrarSesion() {
        sesionIniciada = false;
        System.out.println("Sesi�n cerrada para el empleado.");
    }

    @Override
    public boolean estaSesionIniciada() {
        return sesionIniciada;
    }
}
	
