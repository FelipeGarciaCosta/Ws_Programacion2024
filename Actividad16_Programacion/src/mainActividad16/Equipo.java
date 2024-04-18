package mainActividad16;

import java.util.ArrayList;

public class Equipo {

	private String nombre;
	private ArrayList<String> listaNombres;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getListaNombres() {
		return listaNombres;
	}
	public void setListaNombres(ArrayList<String> listaNombres) {
		this.listaNombres = listaNombres;
	}
	
	public Equipo() {
		super();
	}
	
	public Equipo(String nombre, ArrayList<String> listaNombres) {
		super();
		this.nombre = nombre;
		this.listaNombres = listaNombres;
	}
	
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaNombres=" + listaNombres + "]";
	}
	
	public void mostrarJugadore() {
		for (String s : listaNombres) {
			System.out.println(s);
		}
	}
	
	public boolean existeJugador(String nombre) {
		boolean existe = false;
		for (String s : listaNombres) {
			if(nombre.equalsIgnoreCase(s)) {
				existe = true;
			}
		}
		return existe;
	}
	
	public int cuantosJugadoresHay() {
		int cantidad = this.listaNombres.size();
		return cantidad;
	}
	
	public boolean esAptoJugar() {
		if(cuantosJugadoresHay() <= 7) {
			return false;
		}else {
			return true;
		}
	}
	 
	public boolean esIgualLista(ArrayList<String> listaJugadores) {
		boolean existe = false;
		for(int i = 0; i < this.listaNombres.size() ; i++) {
			existe = false;
			for(int j = 0; j < listaJugadores.size(); j++) {
				if(this.listaNombres.get(i).equalsIgnoreCase(listaJugadores.get(j))) {
					//System.out.println("El jugador existe");
					existe = true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public boolean sonIgualesEquipos(Equipo equipo) {
		boolean sonIguales = false;
		if(this.nombre.equalsIgnoreCase(equipo.nombre) ) {
			if(esIgualLista(equipo.listaNombres)) {
				sonIguales = true;
			}
		}

		return sonIguales;

	}
	
	
	
	
	
}
