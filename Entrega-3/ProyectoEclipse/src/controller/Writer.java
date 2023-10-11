package controller;

import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Sede;
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
		String idAlquiler ="";
		if (carro.getUsoActual()==null){
		}
		else {
			idAlquiler=String.valueOf(carro.getUsoActual().getIDalquileres());
		}
		String nombreCategoria=carro.getCategoria().getNombre();
		String nombreSede=carro.getSede().getNombre();
		String estado =carro.getEstado();
		String fechaDisp =String.valueOf(carro.getFechaDispCons());
		String str = placa+";"+marca+";"+modelo+";"+color+";"+tipoTransmision+";"
				+idAlquiler+";"+nombreCategoria+";"+nombreSede+";"+estado+";"
				+fechaDisp;
		return str;
	
	}
		// SEGUNDO OBJETO: ALQUILER
		public String comprimirAlquiler(Alquiler alquiler) {
			String id=String.valueOf(alquiler.getIDalquileres());
			String usuarioCliente=alquiler.getCliente().getUsuario();
			String sedeDevolucion =alquiler.getSedeDevolucion().getNombre();
			String fechaDevolucion=alquiler.getFechaDeb();
			String str =id+";"+usuarioCliente+";"+sedeDevolucion+";"+fechaDevolucion;
			return str;
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
}}
	

	