package _05_arrays;

import java.util.Arrays;

import javax.print.DocFlavor.STRING;

public class Restaurante {

	int id; //por defecto esto será 0
	String nombre; //null
	double [] puntuaciones; //null
	
	
	public Restaurante() {
		super();
	}


	public Restaurante(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", nombre=" + nombre + ", puntuaciones=" + Arrays.toString(puntuaciones) + "]";
	}
	
	
}
