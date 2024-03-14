package PaquetePrincipal;

public class Entidad_Trabajador {

	String nombre;
	String dni;
	double salario;
	
	
	
	
	public Entidad_Trabajador() {
		super();
	}




	public Entidad_Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}




	@Override
	public String toString() {
		return "Entidad_Trabajador : [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	
	public boolean validarDNI() {
		
		char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		if(this.dni == null || this.dni.length() != 9) {
			return false;
		}
		
		int digitosDni = Integer.parseInt(this.dni.substring(0,8));
		
		char letraDNI = this.dni.charAt(8);
		int residuo = digitosDni % 23;
		
		System.out.println("El residuo es: " + residuo);
		if(tablaLetras[residuo] == letraDNI) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean ganaMas(Entidad_Trabajador entidad_Trabajador) {
		
		if(this.salario > entidad_Trabajador.salario) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean sonIguales(Entidad_Trabajador entidad_Trabajador) {
		if(entidad_Trabajador.dni.equals(this.dni) && entidad_Trabajador.nombre.equals(this.nombre) && entidad_Trabajador.salario == this.salario)  {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
