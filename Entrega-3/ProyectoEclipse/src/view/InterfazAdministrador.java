package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.BaseDatos;
import controller.ControllerAdministrador;
import controller.ControllerCliente;

public class InterfazAdministrador {
	public static ControllerAdministrador elAdministrador;
	public static void correrAdministrador(BaseDatos datos) throws Exception
	{
		System.out.println("Bienvenido Administrador");
		elAdministrador= new ControllerAdministrador();
		elAdministrador.setDatos(datos); // Creamos instancia del controlador y añadimos los datos
		// para trabajar
		
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					login();
				    boolean continuar2 = true;
					while (continuar2) 
					{
						try
						{
							mostrarMenu2();
							int opcion_seleccionada2 = Integer.parseInt(input("Por favor seleccione una opcion: "));
							if (opcion_seleccionada2 == 1) {
								
								String placa=input("Ingrese la placa del vehiculo");
								String marca=input("Ingrese la marca del vehiculo");
								String modelo=input("Ingrese el modelo del vehiculo");
								String color=input("Escriba el color del vehiculo");
								String transmision=input("Escriba e ltipo de transmision del vehiculo");
								ControllerAdministrador.agregarVehiculo(placa,marca,modelo,color,transmision);
								
							}
							else if (opcion_seleccionada2 == 2) {
								String id=input("Ingrese el documento de identidad del empleado");
								String nombre=input("Ingrese el nombre del empleado");
								String usuario=input("Asigne un nombre de usuario para el ingreso del empleado");
								String contrasena=input("Asigne un password para la contrasena del usuario");
								String email=input("Ingrese el email del empleado");
								String sede=input("Ingrese la sede a la que pertenece el empleado");
								ControllerAdministrador.agregarEmpleado(id, nombre, usuario, contrasena, email, sede);
							}
						}
						catch (NumberFormatException e)
						{
							System.out.println("Debe seleccionar uno de los números de las opciones.");
						}
					}
				}
				else if (opcion_seleccionada == 2)
				{
					//cargarDatos();
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else if (elAdministrador == null)
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

	public static String input(String mensaje)
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
		public static void mostrarMenu()
		{
			System.out.println("\nOpciones de la aplicación\n");
			System.out.println("1. LogIn");
			System.out.println("2. Salir de la aplicacion");
		}
		
		public static void mostrarMenu2()
		{
			System.out.println("\nSeleccione alguna de las opciones");
			System.out.println("1. Registrar nuevo Vehiculos");
			System.out.println("2. Registrar Empleado nuevo");
		}
		
		public static void login() {
			String usuario =input("Usuario ");
			String contrasena =input("contraseña ");
			
			elAdministrador.logIn(usuario, contrasena);
			if(elAdministrador.getAdministrador().equals(null)) {
				System.out.println("Error ingresando sesión");
				
			}
			else {
				System.out.println("Ingresado correctamente");	
			}
		}
  public static void crearReserva() {
	  String nombreCat=input("Categoria: ");
	  String sedeRec=input("Sede alquiler: ");
	  String timeRecoger=input("Fecha-hora alquiler: ");
	  String sedeFin=input("sede entrega");
	  String timeFin=input("Fecha-hora entrega");
	  double cobro=elAdministrador.crearReserva(nombreCat, sedeRec, timeRecoger, sedeFin, timeFin);
	
	  if(cobro!=0) {
	  System.out.println("Su reserva está lista, se le cobró el 30% correspondiente a"
			  +cobro );
	  }
	  else{
		  System.out.println("No hay carros disponibles, intente cambiar la categoría o las fechas");
	  }

	}
  
  public static void cargarDatos() throws IOException {
	  elAdministrador.actualizarDatos();
  }


}
