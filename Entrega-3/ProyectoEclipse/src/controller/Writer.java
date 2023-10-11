package controller;

import java.util.HashMap;

import model.Alquiler;
import model.Carro;
import model.Categoria;
import model.Sede;

// Esta clase traduce los objetos a string y viceversa, para la persistencia
public class Writer {
/// SOLO METODOS
	// PRIMER OBJETO: CARRO
	//Writer
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
 {
		
	}
	}