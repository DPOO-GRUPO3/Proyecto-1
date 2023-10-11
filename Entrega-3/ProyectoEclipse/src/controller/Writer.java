package controller;

import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Cliente;
import model.Licencia;
import model.Reserva;
import model.Sede;
import model.Tarjeta;
import model.Temporada;

// Esta clase traduce los objetos a stringpara la persistencia
public class Writer {
/// SOLO METODOS
	// PRIMER OBJETO: CARRO
	
	public String comprimirCarro(Carro carro) {
		String placa = carro.getPlaca();
		String marca = carro.getmarca();
		String modelo =carro.getModelo();
		String color =carro.getColor();
		String tipoTransmision =carro.getTipoTransmision();
	
		String nombreCategoria=carro.getCategoria().getNombre();
		String nombreSede=carro.getSede().getNombre();
		String estado =carro.getEstado();
		String fechaDisp =String.valueOf(carro.getFechaDispCons());
		String str = placa+";"+marca+";"+modelo+";"+color+";"+tipoTransmision+";"
				+";"+nombreCategoria+";"+nombreSede+";"+estado+";"
				+fechaDisp;
		return str;
	
	}
		// SEGUNDO OBJETO: ALQUILER
		public String comprimirAlquiler(Alquiler alquiler) {
			String id=String.valueOf(alquiler.getAlquileresId());
			String sedeFin=alquiler.getSedeDevolucion().getNombre();
			String sedeInicio=alquiler.getSedeRecoger().getNombre();
			String placa=alquiler.getCarro().getPlaca();
			String fin =String.valueOf(alquiler.getFechaDeb());
			String inicio =String.valueOf(alquiler.getFechaInicio());
			String usuarioCliente=alquiler.getCliente().getUsuario();
			return id+";"+sedeFin+";"+sedeInicio+";"+placa+";"+fin+";"+
					inicio+";"+usuarioCliente;
		}
		// TERCER OBJETO: CATEGORIA
		public String comprimirCategoria(Categoria categoria) {
			String nombre = categoria.getNombre();
			String tarifa = String.valueOf(categoria.tarifaCat());
			return nombre+";"+tarifa;
		}
	// CUARTO OBJETO: TEMPORADA
	public String comprimirTemporada(Temporada temporada) {
		String id =String.valueOf(temporada.getIdTemporada());
		String fechaInicio =String.valueOf(temporada.getInicioTemporada());
		String fechaFin =String.valueOf(temporada.getFinTemporada());
		String tarifa =String.valueOf(temporada.getTarifaTemporada());
		return id+";"+fechaInicio+";"+fechaFin+";"+tarifa;
		
	}
// QUINTO OBJETO: SEDE
public String comprimirSede(Sede sede) {
	String nombre = sede.getNombre();
	String direccion=sede.getUbicacion();
	String inicio=sede.getInicio().toString();
	String fin= sede.getFin().toString();
	return nombre+";"+direccion+";"+inicio+";"+fin;
}
//SEXTO OBJETO: Tarjeta
public String comprimirTarjeta(Tarjeta tarjeta) {
	String numero =tarjeta.getNumero();
	String codigo=tarjeta.getCodigo();
	String bloqueada="0";
	if (tarjeta.getBloqueo()==true) {
		bloqueada="1";
	}
	return numero+";"+codigo+";"+bloqueada;
}
// SEPTIMO OBJETO LICENCIA
public String comprimirLicencia(Licencia licencia) {
	String fechaVens =licencia.getFechaVens();
	String numero=licencia.getNumero();
	String pais=licencia.getPais();
	String rutaImagen =licencia.getRutaImagen();
	String idAlquiler=licencia.getAlq();

	return fechaVens+";"+numero+";"+pais+";"+rutaImagen+";"+idAlquiler;
	
}
// OCTAVO OBJETO: Cliente
public String comprimirCliente(Cliente cliente) {
	String contrasena=cliente.getContrasena();
	String email=cliente.getEmail();
	String pais =cliente.getNacionalidad();
	String nombre =cliente.getNombre();
	String rutaImagen=cliente.getRutaImagenID();
	String usuario=cliente.getUsuario();
	String numLicencia=cliente.getLicencia().getNumero();
	String numTarjeta=cliente.getTarjeta().getNumero();
	return usuario+";"+contrasena+";"+email+";"+pais+";"+nombre
			+";"+rutaImagen+";"+numLicencia+";"+numTarjeta;
}
//NOVENO OBJETO: Reserva
public String comprimirReserva(Reserva reserva) {
	String idReserva=String.valueOf(reserva.getNumReserva());
	String sedeFin=reserva.getSedeFin().getNombre();
	String sedeInicio=reserva.getSedeInicio().getNombre();
	String placa=reserva.getCarroReservado().getPlaca();
	String categoria=reserva.getCategoria().getNombre();
	String fin =String.valueOf(reserva.getFechaYHoraFin());
	String inicio =String.valueOf(reserva.getFechaYHoraInicio());
	String UsuarioCliente=reserva.getCliente().getUsuario();
	return idReserva+";"+sedeFin+";"+sedeInicio+";"+placa+";"+categoria
			+";"+fin+";"+inicio+";"+UsuarioCliente;
}
}
	

	