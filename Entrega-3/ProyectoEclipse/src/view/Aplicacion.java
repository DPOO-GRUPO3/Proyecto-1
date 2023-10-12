package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import consola.Aplicacion;
import controller.BaseDatos;


public class Aplicacion {
	private BaseDatos datos;

	private void ejecutarAplicacion() throws IOException
	{
		System.out.println("Ramenautos");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				cargarDatos();
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1) {
					usarAdminGeneral();}
				else if (opcion_seleccionada == 2)
					usarAdminSede();
				else if (opcion_seleccionada == 3 )
					usarEmpleado;
				else if (opcion_seleccionada == 4 ) {
					InterfazCliente elCliente= new InterfazCliente();
					elCliente.correrCliente();
					
				}}
				
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		
		}}
		public void mostrarMenu()
		{
			System.out.println("\nOpciones de la aplicación\n");
			System.out.println("1. Admin general");
			System.out.println("2. Admin Sede");
			System.out.println("3. Empleado");
			System.out.println("4. Cliente");

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
	System.out.println("Descargando datos: ");

		datos = new BaseDatos();
		datos.deacargarTodoslosDatos();
		System.out.println("Se actualizaron los datos");
}
public static void main(String[] args) throws IOException {
	
	Aplicacion consola = new Aplicacion();
	consola.ejecutarAplicacion();
}
}

