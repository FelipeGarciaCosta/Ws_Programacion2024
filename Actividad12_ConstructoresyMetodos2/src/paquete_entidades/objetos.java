package paquete_entidades;



public class objetos {



	int id;

	String marca;

	String modelo;

	double precio;

	String fecha_matric; //formato: DD/MM/AAAA

	double km;

	

	

	public objetos() {//Constructor con marca y modelo vacios

		this.marca = "";

		this.modelo = "";

	}





	public objetos(int id, String nombre, String modelo, double precio, String fecha_matric, double km) { //constructor creado x teclado.

		super();

		this.id = id;

		this.marca = nombre;

		this.modelo = modelo;

		this.precio = precio;

		this.fecha_matric = fecha_matric;

		this.km = km;

	}





	@Override

	public String toString() {

		return "objetos [id=" + id + ", nombre=" + marca + ", modelo=" + modelo + ", precio=" + precio

				+ ", fecha_matric=" + fecha_matric + ", km=" + km + "]";

	}

	



	public void mostrarPrecio() {

		System.out.println("El precio base del coche  con marca: " + this.marca + " es: " + precio);

	}

	

	public void mostrarAnio() {

		System.out.println("El año de matriculación de su coche es: " + fecha_matric.substring(6,fecha_matric.length()));

	}

	

	public void anioBisiesto() {

		//para saber si un año es bisisiesto o no hay que saber si es divisible por 4, a su vez si es divisible por 100, también debe ser divisible por 400

		//concluimos con la siguiente fórmula:

		boolean esBisiesto = false;

		int anio = Integer.parseInt(fecha_matric.substring(6,fecha_matric.length()));

		//Formula que se me ocurrio a mi:

		/*if(anio % 4 == 0) {

			if(anio % 100 == 0 && anio % 400 != 0) {//ejemplo año 1900, entra en el 1er if por ser divisible por 4 y entra en el 2do if por ser 

				//divisible por 100 pero no por 400, resultando en un false

				esBisiesto = false;

			}else {

				esBisiesto = true;

			}

		}*/

		

		//Formula que de internet:

		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {

            esBisiesto = true;

        } else {

            esBisiesto = false;

        }

		if(esBisiesto) {

			System.out.println("El año del coche con marca: " + this.marca + " es bisiesto");

		}else {

			System.out.println("El año del coche  con marca: " + this.marca + " NO es bisiesto");

		}

		

	}

	

	public double precioSegunKm() {

		double precioFinal = 0;

		if(this.km < 10000) {

			precioFinal = this.precio;

		}else if(this.km >= 10000 && this.km < 50000) {

			precioFinal = this.precio * 0.8;

		}else if(this.km >= 50000) {

			precioFinal = this.precio * 0.5;

		}

		return precioFinal;

	

	}

			

	public boolean esPrimo() {

		boolean esPrimo = false;

		int numeroKmSinDecimal = (int)this.km;

		for(int i = 2; i < numeroKmSinDecimal; i++) {

			if(numeroKmSinDecimal % i == 0) {

				esPrimo = false;

				break;

			}else {

				esPrimo = true;

			}

		}

		return esPrimo;

	}

	

	public double cuantosFaltan200K() {

		double kmFaltantes = 200000 - this.km;

		return kmFaltantes;

	}

	

	public int cuantosCaracteresHay() {

		int cantCaracteres = this.marca.length() + this.modelo.length();

		return cantCaracteres;

	}

	

	public double diferenciaKmCoches(double kmPasados) {

		double difKm = 0;

		difKm = this.km - kmPasados;

		if(difKm < 0) {

			difKm = difKm * -1;

		}

		

		return difKm;

	}



	public int cocheMasCaro(double precioCoche2) {

		int cocheCaro = 0;

		if(this.precio > precioCoche2) {

			cocheCaro = 1;

		}else if(this.precio < precioCoche2) {

			cocheCaro = 2;

		}else {

			cocheCaro = 0; //es medio redundante esta línea pero bueno para que qude mejor en la documentación

		}



		return cocheCaro;

	}

	
}



