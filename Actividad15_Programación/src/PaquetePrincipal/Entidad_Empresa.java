package PaquetePrincipal;

import java.util.Arrays;

public class Entidad_Empresa {

	
	String nombre;
	String nif;
	Entidad_Trabajador[] listaTrabajadores;
	
	public Entidad_Empresa() {
		super();
	}

	public Entidad_Empresa(String nombre, String nif, Entidad_Trabajador[] listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}

	@Override
	public String toString() {
		return "Entidad_Empresa [nombre=" + nombre + ", nif=" + nif + ", listaTrabajadores="
				+ Arrays.toString(listaTrabajadores) + "]";
	}
	
	public void mostrarDatosTrabajador() {
		for (Entidad_Trabajador s : listaTrabajadores) {
			System.out.println(s.nombre);
			System.out.println(s.dni);
			System.out.println(s.salario);
		}
	}
	
	public boolean existeTrabajador(String dni) {
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e.dni.equalsIgnoreCase(dni)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int cantTrabajadores() {
		int total = 0;
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e != null){
				total++;
			}
		}
		return total;
	}
	
	public double cantidadEnSueldos() {
		double cantTotal = 0;
		for (Entidad_Trabajador e : listaTrabajadores) {
			cantTotal += e.salario;
		}
		return cantTotal;
	}
	
	public int cuantosCobran3K() {
		int cant3K = 0;
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e.salario > 3000) {
				cant3K++;
			}
		}
		return cant3K;
	}
	
	public int cuantosCobranMenosSMI() {
		int total = 0;
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e.salario < 950) {
				total++;
			}
		}
		return total;
	}
	
	public int cuantosCobranMasQue(double numero) {
		int total = 0;
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e.salario > numero) {
				total++;
			}
		}
		return total;
	}
	
	public boolean todosDniValido() {
		for (Entidad_Trabajador e : listaTrabajadores) {
			if(e.validarDNI() == false) {
				return false;
			}
		}
		return true;
	}
	
	public boolean sonIgualesEmpresas(Entidad_Empresa entidad_Empresa) {
		if(this.nif.equalsIgnoreCase(entidad_Empresa.nif) && this.nombre.equals(entidad_Empresa.nombre)) {
			return true;
		}
		return false;
	}
	
	
}
