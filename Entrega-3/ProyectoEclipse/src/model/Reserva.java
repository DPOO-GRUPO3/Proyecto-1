package model;

public class Reserva {
private Cliente cliente;
private double fechaYHoraInicio;
private double fechaYHoraFin;
private Categoria categoria;
private Carro carroReservado;
private Sede sedeInicio;
private Sede sedeFin;
private int numeroReserva;
public static int numeroReservas;

public Reserva(Cliente cliente,double fechaYHoraInicio,double fechaYHoraFin,
		Categoria categoria,Carro carroReservado,Sede sedeInicio,Sede sedeFin
		) {
	numeroReservas++;
	this.numeroReserva=numeroReserva+1;
	this.cliente=cliente;
	this.fechaYHoraInicio=fechaYHoraInicio;
	this.fechaYHoraFin=fechaYHoraFin;
	this.categoria =categoria;
	this.carroReservado=carroReservado;
	this.sedeInicio=sedeInicio;
	this.sedeFin=sedeFin;
	
}
public void setNumReserva(int num) {
	this.numeroReserva=num;
}
public static int getNumeroReservas() {
	return numeroReservas;
}
public Categoria getCategoria() {
	return categoria;
}
public double getFechaYHoraInicio() {
	return fechaYHoraInicio;
}
public double getFechaYHoraFin() {
	return fechaYHoraFin;
}
public int getNumReserva() {
	return numeroReserva;
}
public Sede getSedeFin() {
	return sedeFin;
}
public Sede getSedeInicio() {
	return sedeInicio;
}
public Carro getCarroReservado() {
	return carroReservado;
}
public Cliente getCliente() {
	return cliente;
}
}
