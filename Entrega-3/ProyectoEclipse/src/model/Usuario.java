package model;

public interface Usuario {
	    
	public String getUsuario();
	public String getContrasena();
	public String getNombre();
    
	/*
	 * METODOS LOGIN 
	 * */
    void iniciarSesion(String nombreUsuario, String contrase�a);
    void cerrarSesion();
    boolean estaSesionIniciada();

}
