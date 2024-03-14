package _02_constructores;


//Instancia de un objeto: el valor de los atributos en un estado de tiempo dado


//Dentro de una clase, ademas de atributos
public class Persona {
	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;

	public Persona() {
	
	}
	
	public Persona (String nombre,int edad, double peso, boolean estaCasado) {	
		this.nombre = nombre;		
		this.edad= edad;
		this.estaCasado = estaCasado;
		this.peso = peso;
	}
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	
	
	public void presentarse() {
		System.out.println("mi nombre es: " + this.nombre);
		System.out.println("Mi edad es: " + edad);
		//poedemos poner la "edad"sin "this" siemrpe y cuando no se haya declarado una variable o un parámetro de
		//entrada con el nombre "Edad"
		System.out.println("Mi peso es: " + this.peso);
	}
	
}

