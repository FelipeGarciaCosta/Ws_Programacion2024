package entidad;

public class entidadVideojuego {
	public long id;
	public String nombre;
	public double puntuacion;
	public double precio;
	public String fechaCreacion;
	public boolean esSegundaMano;
	
	
	public entidadVideojuego(){
		super(); // siempre va al principio, si no, java lo pone automáticamente
		this.fechaCreacion = "01/01/1970";
	}
	

	public entidadVideojuego(long id, String nombre, double puntuacion, double precio, String fechaCreacion,
			boolean esSegundaMano) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.esSegundaMano = esSegundaMano;
	}


	public entidadVideojuego(String nombre, String fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public void mostrarDatos() { //mostrar todos los datos, con metedo toString copiado
		System.out.println("entidadVideojuego [id=" + id + ", nombre=" + nombre + ", puntuacion=" + puntuacion + ", precio="
				+ precio + ", fechaCreacion=" + fechaCreacion + ", esSegundaMano=" + esSegundaMano + "]");
	}
	
	public void mostrarNombrePuntuacion() { //mostrar todos los datos, con metedo toString copiado
		System.out.println( "Videojuego [ nombre = " + nombre + ", puntuacion= " + puntuacion + "]");
	}
	
	public void mostrarPrecioEnLibras() {
		double precioLibras = this.precio * 0.86;
		System.out.println("El precio en libras es = " + precioLibras);
	}
	
	public void mostrarFormatoFechaDiferente() {
		String [] fechaPartida = this.fechaCreacion.split("/"); //split devuelve un array del String dividido según lo que le digamos, en este caso sería /
		String dia = fechaPartida[0];
		String mes = fechaPartida[1];
		String anio = fechaPartida[2];
		
		String fechaInvertida = anio + "-" + mes + "-" + dia;
		System.out.println(fechaInvertida);
	}
	
	public void mostrarFechaInvertidaSubString() { //Otra forma de hacer lo mismo que cambiarFormatoFecha pero utilizando la clase substring
		//RECORDAR QUE substring es (*1er valor*, *2do valor -1*);
		String dia = this.fechaCreacion.substring(0,2);
		String mes = this.fechaCreacion.substring(3,5);
		String anio =  this.fechaCreacion.substring(6,this.fechaCreacion.length());
		
		String fechaInvertida = anio + "-" + mes + "-" + dia;
		System.out.println(fechaInvertida);
	}
	
	public double calcularDescuento() {
		double precioConDescuento = this.precio;
		if(this.esSegundaMano) {
			precioConDescuento = this.precio * 0.7;
		}
		
		return precioConDescuento;
	}
	
	public void mostrarEsJugable() {
		if(this.puntuacion >= 5) {
			System.out.println("EL videojuego es apto para ser jugado");
		}else {
			System.out.println("Ni te gastes en jugarlo, el videojuego NO es apto para jugarlo");
		}
	}
	
	public void mostrarNumerosNaturalesHastaDiez(){
		for(int i = (int)this.puntuacion; i < 10; i++) {
			System.out.println(i);
		}
	}
	/**
	 * 
	 * @param videojuego
	 * @return
	 */
	
	public boolean esMasCaro(entidadVideojuego videojuego) {
	
		if(this.precio <= videojuego.precio) {
			return false;
		}else {
			return true;
		}
	}
	
	
}
