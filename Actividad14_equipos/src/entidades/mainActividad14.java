package entidades;

import java.util.Scanner;

public class mainActividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Entidad_equipo lista1 = new Entidad_equipo();
		Entidad_equipo lista2 = new Entidad_equipo();
		
		Entidad_equipo[] equipos = new Entidad_equipo[2];
		equipos[0] = lista1;
		equipos[1] = lista2;
		
		for (Entidad_equipo e : equipos) {
			pedirDatos(e, sc);
			
			System.out.println(e.toString());
			e.mostrarJugadores();
			System.out.println("Indique el jugador que quiera buscar dentro de la lista a ver si está");
			String nombre = sc.nextLine();
			System.out.println("existe = " + e.buscarSiExiste(nombre));
			System.out.println("Es apto el equipo para jugar = " + e.esApto());
		
		}
		
		System.out.println("Los equipos son iguales: " + lista1.equiposIguales(lista2));
		
		
		sc.close();
	}
	
	public static void pedirDatos(Entidad_equipo equipo,Scanner sc ) {

		System.out.println("Introduzca nombre de la lista: ");
		equipo.nombre = sc.nextLine();
		System.out.println("cuantos jugadores quiere añadir a su lista: ");
		int cantJugadores = sc.nextInt();
		sc.nextLine();
		String[] listaJugadores = new String[cantJugadores];
		
		for(int i = 0; i< cantJugadores; i++) {
			System.out.println("Ingrese jugador: ");
			listaJugadores[i] = sc.nextLine();
		}
	
		equipo.jugadores = listaJugadores;
		
	}

}
