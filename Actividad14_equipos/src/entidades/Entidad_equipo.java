package entidades;

import java.util.Arrays;

public class Entidad_equipo {

	String nombre;
	String[] jugadores;
	
	
	public Entidad_equipo() {
		super();
	}
	
	public Entidad_equipo(String nombre, String[] jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "entidad_equipo [nombre=" + nombre + ", jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	
	public void mostrarJugadores() {
		for(String jugador : this.jugadores ) {
			System.out.println(jugador);
		}
	}
	
	
	public boolean buscarSiExiste(String hayJugador) {
		boolean existe = false;
		for(String jugador : this.jugadores ) {
			if(hayJugador.equalsIgnoreCase(jugador)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public int cantidadJugadores() {
		int cantidad =0;
		cantidad = this.jugadores.length;
		return cantidad;
	}
	
	public boolean esApto() {
		boolean puedeJugar =false;
		if(this.jugadores.length > 7) {
			puedeJugar = true;
		}
		return puedeJugar;
	}
	
	public boolean esIgualA(String[]jugadores2) {
		boolean esIgual = false;
		for(int i = 0; i < this.jugadores.length; i++) {
			esIgual = false;
			for(int j = 0; j < jugadores2.length; j++) {
				if(this.jugadores[i].equalsIgnoreCase(jugadores2[j])) {
					esIgual = true;
					break;
				}
			}
		}
		return esIgual;
	}
	
	public boolean equiposIguales(Entidad_equipo equipo) {
		boolean sonIguales = false;
		if(this.nombre.equalsIgnoreCase(equipo.nombre) ) {
			if(esIgualA(equipo.jugadores)) {
				sonIguales = true;
			}
		}

		return sonIguales;
	}
}
