package main;

import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private ArrayList<String> listaJugadores;
	
	public Equipo() {
		super();
	}
	
	public Equipo(String nombre, ArrayList<String> listaJugadores) {
		super();
		this.nombre = nombre;
		this.listaJugadores = listaJugadores;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getLisltaEquipos() {
		return listaJugadores;
	}
	public void setLisltaEquipos(ArrayList<String> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", lisltaEquipos=" + listaJugadores + "]";
	}
	
	public void mostrarJugadores() {
		for (String s : listaJugadores) {
			System.out.println("jugador: " + s);
		}
	}
	
	public boolean existeJugador(String jugador) {
		boolean existe = false;
		for (String s : listaJugadores) {
			if(s.equalsIgnoreCase(jugador)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public int cantJugadores() {
		int cantidadTotal = 0;
		cantidadTotal = listaJugadores.size();
		return cantidadTotal;
	}
	
	
	
	public boolean listaIguala(ArrayList<String> listaJugadores2) {
		boolean sonIguales = false;
		for(int i = 0; i < this.listaJugadores.size(); i++) {
			sonIguales = false;
			for(int j = 0; j < listaJugadores2.size(); j++) {
				if(this.listaJugadores.get(i).equalsIgnoreCase(listaJugadores2.get(j))) {
					sonIguales = true;
				}
			}
		}
		return sonIguales;
	}
	
	
}
