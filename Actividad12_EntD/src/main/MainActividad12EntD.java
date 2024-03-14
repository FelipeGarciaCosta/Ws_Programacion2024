package main;

import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Casa;
import Entidades.Direccion;
import Entidades.Habitacion;
import Entidades.Jardin;
import Entidades.TipoHabitacion;

public class MainActividad12EntD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Crearemos la primera casa");
		Casa c1 = cargarCasa(sc);
		System.out.println("Crearemos la segunda casa");
		Casa c2 = cargarCasa(sc);

		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println(c1.toString());
		System.out.println("La cantidad total de METROS de la casa 1 es: " + c1.calcularTotalMetros());
		System.out.println(" El precio de la casa 1 es: " + c1.calcularPrecioConIVA());
		System.out.println(" Es CHALET ? = " + c1.esChalet());
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println(c2.toString());
		System.out.println("La cantidad total de METROS de la casa 2 es: " + c2.calcularTotalMetros());
		System.out.println(" El precio de la casa 2 es: " + c2.calcularPrecioConIVA());
		System.out.println(" Es CHALET ? = " + c2.esChalet());
	}

	public static Casa cargarCasa(Scanner sc) {
		Casa c = new Casa();
		Direccion d = new Direccion();
		sc.nextLine();
		System.out.println("Ingrese la dirección de la casa: ");
		d.setNombreVia(sc.nextLine());
		System.out.println("Ingrese tipo de via: ");
		d.setTipoVia(sc.nextLine());
		System.out.println("Ingrese localidad: ");
		d.setLocalidad(sc.nextLine());
		System.out.println("Ingrese el CP: ");
		d.setCP(sc.nextInt());
		
		c.setDireccion(d);
		System.out.println("Ingrese precio de la casa: ");
		c.setPrecio(sc.nextDouble());
		System.out.println("Ingrese si es de segunda mano o no");
		c.setEsSegundaMano(sc.nextBoolean());
		System.out.println("Ingrese la cantidad de metros de la casa");
		c.setCantMetros(sc.nextDouble());
		
		Jardin j = new Jardin();
		System.out.println("Ingrese la cantidad de metros del jardin");
		j.setCantMeTros(sc.nextDouble());
		System.out.println("Ingrese la cantidad de plantas del jardin");
		j.setNumeroPlantas(sc.nextInt());
		c.setJardin(j);
		
		ArrayList<Habitacion> hab = new ArrayList<Habitacion>();
		System.out.println("Ingrese la cantidad de habitaciones");
		int cantHab = sc.nextInt();
		for(int i = 0; i<cantHab; i++) {
			hab.add(crearHabitacion(sc));
		}
		c.setHabitaciones(hab);
		return c;
	}
	
	
	public static Habitacion crearHabitacion(Scanner sc) {
		Habitacion h = new Habitacion();
		sc.nextLine();
		sc.nextLine();
		System.out.println("Ingrese nombre de la habitación");
		h.setNombre(sc.nextLine());
		System.out.println("Ingrese cantidad de metros de la habtiación");
		h.setCantMetros(sc.nextDouble());
		System.out.println("Ingrese el tipo de la habitación");
		for(int i = 0; i<TipoHabitacion.values().length ; i++) {
			System.out.println(i + "-" + TipoHabitacion.values()[i]);
		}
		h.setTipoHabitacion(TipoHabitacion.values()[sc.nextInt()]);
		return h;
	}
}
