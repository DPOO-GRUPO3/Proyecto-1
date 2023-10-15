package model;

public class Administrador implements Usuario {
	
    private String nombreUsuario;
    private String contraseña;
    private boolean sesionIniciada;

    public Administrador(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    
	public void añadirEmpleado(String login, String password) throws Exception {
		añadirEmpleado(login, password);
	}
	
	public void añadirVehiculo(String placa, String marca, String modelo,String color, String tipoTransmision) throws Exception {
		añadirVehiculo(placa, marca, modelo, color,tipoTransmision);
	}
	
    
    /*
     * Inicion de sesion
     * */

    @Override
    public void iniciarSesion(String nombreUsuario, String contraseña) {
        if (nombreUsuario.equals(this.nombreUsuario) && contraseña.equals(this.contraseña)) {
            sesionIniciada = true;
            System.out.println("Sesión iniciada para el administrador: " + nombreUsuario);
        } else {
            System.out.println("Error: Nombre de usuario o contraseña incorrectos.");
        }
    }

    @Override
    public void cerrarSesion() {
        sesionIniciada = false;
        System.out.println("Sesión cerrada para el administrador.");
    }

    @Override
    public boolean estaSesionIniciada() {
        return sesionIniciada;
    }
}







