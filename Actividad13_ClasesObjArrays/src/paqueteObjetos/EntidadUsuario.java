package paqueteObjetos;

import java.util.Arrays;

public class EntidadUsuario {

	int id;
	String nombre;
	double[] valoraciones = new double[3];
	
	public EntidadUsuario(){
		
	}

	public EntidadUsuario(int id, String nombre, double[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	@Override
	public String toString() {
		return "EntidadUsuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones)
				+ "]";
	}

	
	//Los objetos tendrán la opción de devolver su valoración media. Por ejemplo, si un objeto tiene [3,5,7], devolverá 5.
	
	public int devolverMediaValoraciones() {
		int media = 0;
		for(int i = 0; i < this.valoraciones.length; i++) {
			media += this.valoraciones[i];
		}
		media = media/this.valoraciones.length;
		return media;
	}
	
	//Los objetos tendrán la opción de mostrar todas sus valoraciones.
	
	public void mostrarValoraciones() {
		for(int i = 0; i< this.valoraciones.length; i++) {
			System.out.print(this.valoraciones[i] + " || ");
		}
	}
	
	public int devolverCantValoracionesSuperioresa(int numero) {
		int cantSup = 0;
		for(int i = 0; i < this.valoraciones.length; i++) {
			if(numero < this.valoraciones[i]) {
				cantSup++;
			}
		}
		return cantSup;
	}

	public boolean devolverSuperaMedia(int numero) {
		boolean esMayorMedia = false;
		if(numero < devolverMediaValoraciones() ) {
			esMayorMedia = true;
		}
		return esMayorMedia;
	}
	
	
	
}
