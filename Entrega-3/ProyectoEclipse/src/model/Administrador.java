package model;

public class Administrador implements Usuario {
	
    private String nombreUsuario;
    private String contrase�a;
    private boolean sesionIniciada;

    public Administrador(String nombreUsuario, String contrase�a) {
        this.nombreUsuario = nombreUsuario;
        this.contrase�a = contrase�a;
    }
    
	public void a�adirEmpleado(String login, String password) throws Exception {
		a�adirEmpleado(login, password);
	}
	
	public void a�adirVehiculo(String placa, String marca, String modelo,String color, String tipoTransmision) throws Exception {
		a�adirVehiculo(placa, marca, modelo, color,tipoTransmision);
	}
	
    
    /*
     * Inicion de sesion
     * */

    @Override
    public void iniciarSesion(String nombreUsuario, String contrase�a) {
        if (nombreUsuario.equals(this.nombreUsuario) && contrase�a.equals(this.contrase�a)) {
            sesionIniciada = true;
            System.out.println("Sesi�n iniciada para el administrador: " + nombreUsuario);
        } else {
            System.out.println("Error: Nombre de usuario o contrase�a incorrectos.");
        }
    }

    @Override
    public void cerrarSesion() {
        sesionIniciada = false;
        System.out.println("Sesi�n cerrada para el administrador.");
    }

    @Override
    public boolean estaSesionIniciada() {
        return sesionIniciada;
    }
}







