package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.BaseDatos;
import controller.ControllerCliente;

public class InterfazCliente {
	private ControllerCliente elCliente;
	public void correrCliente(BaseDatos datos) throws IOException
	{
		System.out.println("Bienvenido cliente");
		elCliente= new ControllerCliente();
		elCliente.setDatos(datos); // Creamos instancia del controlador y añadimos los datos
		// para trabajar
		
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					login();
				else if (opcion_seleccionada == 2 && elCliente.getCliente() != null)
					crearReserva();

				else if (opcion_seleccionada == 3)
				{
					actualizarDatos();
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else if (elCliente == null)
				{
					System.out.println("Para poder ejecutar esta opción primero debe iniciar sesión");
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;}
		public void mostrarMenu()
		{
			System.out.println("\nOpciones de la aplicación\n");
			System.out.println("1. LogIn");
			System.out.println("2. CrearReserva");
			System.out.println("3. LogOut");

	}
		public void login() {
			String usuario =input("Usuario: ");
			String contrasena =input("contraseña: ");
			
			elCliente.logIn(usuario, contrasena);
			if(elCliente.getCliente().equals(null)==true) {
				System.out.println("Ingresado correctamente");	
			}
			else {
				System.out.println("Error ingresando sesión");
			}
		}
}
