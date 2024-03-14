package Entidades;

import java.util.ArrayList;

public class Casa {

	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private double cantMetros;
	private Jardin jardin;
	private ArrayList<Habitacion>  habitaciones;	
	
	public int calcularTotalMetros() {
		int totalMetros = 0;
		totalMetros += this.cantMetros;
		totalMetros += jardin.getCantMeTros();
		for (Habitacion h : habitaciones ) {
			totalMetros += h.getCantMetros();
		}		
		return totalMetros;
	}
	
	public boolean esChalet() {
		boolean tieneJardin = false;
		if(this.jardin.cantMetros != 0) {
			tieneJardin = true;
		}
		return tieneJardin;
	}
	
	public double calcularPrecioConIVA() {
		double precioTotal =0;
		if(this.esSegundaMano) {
			precioTotal = this.precio*1.05;
		}else {
			precioTotal = this.precio*1.1;
		}
		
		return precioTotal;
		
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}
	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}
	public double getCantMetros() {
		return cantMetros;
	}
	public void setCantMetros(double cantMetros) {
		this.cantMetros = cantMetros;
	}
	public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	
	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", precio=" + precio + ", esSegundaMano=" + esSegundaMano
				+ ", cantMetros=" + cantMetros + ", jardin=" + jardin + ", habitaciones=" + habitaciones + "]";
	}
	
	
	
}

