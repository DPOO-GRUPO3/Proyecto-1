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

	/*
	 * Metodos inicio de sesion
	 * */ 
	
    //private String usuario;
    //private String contraseña;
    private boolean sesionIniciada;

    public Empleado(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    @Override
    public void iniciarSesion(String nombreUsuario, String contraseña) {
        if (usuario.equals(this.usuario) && contraseña.equals(this.contraseña)) {
            sesionIniciada = true;
            System.out.println("Sesión iniciada para el empleado: " + usuario);
        } else {
            System.out.println("Error: Nombre de usuario o contraseña incorrectos.");
        }
    }

    @Override
    public void cerrarSesion() {
        sesionIniciada = false;
        System.out.println("Sesión cerrada para el empleado.");
    }

    @Override
    public boolean estaSesionIniciada() {
        return sesionIniciada;
    }
}
	
