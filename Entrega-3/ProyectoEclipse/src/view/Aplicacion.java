package view;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import controller.BaseDatos;

import view.InterfazCliente;
public class Aplicacion {
	private BaseDatos datos;

	public void ejecutarAplicacion() throws IOException
	{
		System.out.println("RamenAutos");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					cargarDatos();
				else if (opcion_seleccionada == 2 && datos != null)
					InterfazCliente.correrCliente(datos);
				else if (opcion_seleccionada == 3 && datos != null)
					InterfazCliente.correrCliente(datos);
				else if (opcion_seleccionada == 4 && datos != null)
					InterfazCliente.correrCliente(datos);
				else if (opcion_seleccionada == 5 && datos != null)
					InterfazCliente.correrCliente(datos);

				else if (opcion_seleccionada == 6)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else if (datos == null)
				{
					System.out.println("Para poder ejecutar esta opción primero debe cargar un archivo de atletas.");
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

		private void usarAdminGeneral() {
		// TODO Auto-generated method stub
		
	}
		public void mostrarMenu()
		{
			System.out.println("\nOpciones de la aplicación\n");
			System.out.println("1. Cargar Datos");
			System.out.println("2. ingresar como cliente");
			System.out.println("3. ngresar como cliente");
			System.out.println("4. ngresar como cliente");

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
			return null;
		}
		private void cargarDatos() {
			System.out.println("Cargando datos: ");


			try
			{
				datos = new BaseDatos();
				datos.deacargarTodoslosDatos();
				System.out.println("Se actualizaron los datos");
				
			}
			catch (FileNotFoundException e)
			{
				System.out.println("ERROR: el archivo indicado no se encontró.");
			}
			catch (IOException e)
			{
				System.out.println("ERROR: hubo un problema leyendo el archivo.");
				System.out.println(e.getMessage());
			}
		}
public static void main(String[] args) throws IOException {
	
	Aplicacion consola = new Aplicacion();
	consola.ejecutarAplicacion();
}
}

