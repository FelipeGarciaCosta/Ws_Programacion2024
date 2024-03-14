package Main;
import java.util.ArrayList;
import java.util.Scanner;

import Actividad18.Muniemon;
import Actividad18.TipoMuniemon;

public class MainMuniemon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Muniemon> listaMuniemones = new ArrayList<Muniemon>();
		System.out.println("Bienvenido al videojuego MUNIEMON");
		
		mostarMenu(sc,listaMuniemones);
		
		System.out.println("------------------FIN DEL VIDEOJUEGO------------------");
	}
	
	
	
	
	public static void mostarMenu(Scanner sc, ArrayList<Muniemon> listaMuniemones) {
		int opcionMenu =  0;
		do {

			System.out.println("Ingrese alguna de las siguientes opciones para realizar");
			System.out.println("1.Dar de alta un Muniemon");
			System.out.println("2.Mostrar algún Muniemon ");
			System.out.println("3.LUCHA DE MUNIEMONES");
			System.out.println("4.Mostrar TODOS los Muniones");
			System.out.println("5.Salir del menú");
			opcionMenu = sc.nextInt();
			switch (opcionMenu) {
			case 1: {
				listaMuniemones.add(darAltaMunion(sc));
				break;
			}case 2:{
				System.out.println("Indique que Muniemón de la lista quiere mostrar....");
				int munionAMostrar = sc.nextInt();
				mostrarMunion(sc, listaMuniemones, munionAMostrar);
				break;
			}case 3:{
				System.out.println("Elija el número del Munion que ataca");
				int munionAtacante = sc.nextInt();
				System.out.println("Elija el número del Munion que es atacado");
				int munionDefiende = sc.nextInt();
				atacarMuniemon(listaMuniemones, munionAtacante, munionDefiende);
				break;
			}case 4:{
				mostrarTodosLosMuniones(listaMuniemones);
			}
		}
		
		}while(opcionMenu != 5);
	
	}
	
	/**
	 * Utilizo la función para dar de alta un Muniemon
	 * @param sc es el objeto para recoger valores por pantalla
	 * @return devuelve un objeto de la clase Muniemon
	 */
	
	public static Muniemon darAltaMunion(Scanner sc) {
		Muniemon m1 = new Muniemon();
		System.out.println("Presione enter para continuar....");
		sc.nextLine();
		System.out.println("Para agregar al Munioncito ingrese su nombre");
		m1.setNombre(sc.nextLine()); //inicializo el nombre de mi munion
		System.out.println("Ingrese tipo de munion");
		mostrarTiposMuniemons();
		System.out.println("Elija alguno....");
		m1.setTipoMuniemon(TipoMuniemon.values()[sc.nextInt()]);
		System.out.println("Ingrese cantidad de vida: ");
		m1.setVida(sc.nextInt());
		System.out.println("Ingrese ataque: ");
		m1.setAtaque(sc.nextInt());
		System.out.println("Ingrese defensa");
		m1.setDefensa(sc.nextInt());
		return m1;
		
	}
	
	
	/**
	 * Muestra todos los tipos de Muniemones que hay, invoca al enumerado TipoMuniemon
	 */
	public static void mostrarTiposMuniemons() {
		System.out.println("Los tipos de Muniones a elegir son: ");
		int opcion = 0;
		for (TipoMuniemon tm : TipoMuniemon.values()) {
			System.out.println(opcion + " " + tm);
			opcion++;
		}
	}
	
	
	/**
	 * Muestra únicamente el Muniemon pedido por el usuario de la listaMuniemones
	 * @param sc es el objeto para recoger valores por pantalla
	 * @param listaMuniemones es la lista donde se encuentran todos los Muniemones creados
	 * @param MuniemonAMostrar es el número de índice del Muniemon en la lista 
	 */
	public static void mostrarMunion(Scanner sc, ArrayList<Muniemon> listaMuniemones, int MuniemonAMostrar ) {
		System.out.println("El Munion número: " + MuniemonAMostrar + " es: " + listaMuniemones.get(MuniemonAMostrar));
	}
	
	public static void mostrarTodosLosMuniones(ArrayList<Muniemon> listaMuniemones) {
		for (Muniemon mun : listaMuniemones) {
			System.out.println(mun);
		}
	}

	
	public static void luchaDeMuniones(Scanner sc, ArrayList<Muniemon> listaMuniemones, int munion1, int munion2) {
		//Voy a chequear la listaMuniemones para ver si están los Muniones solicitados
		boolean estanLosMuniones = false;
		if(listaMuniemones.get(munion1) != null && listaMuniemones.get(munion2) != null) {
			estanLosMuniones = true;
			System.out.println("Los Muniemones están dentro de la lista, Se están preparando para luchar :)");
		}else {
			System.out.println("Los Muniemones no se encuentran dentro de la lista, por favor darlos de alta +"
					+ "o ingrese un índice de algún Muniemon existente");
		}
		//Si están los Muniones solicitados, procedo a realizar los algoritmos para que luchen entre ellos y luego,
		//cambio el estado de los Muniones luego de la lucha
		
		if(estanLosMuniones) {
			
		}else {
			
		}
	}
	
	public static boolean estaVivo(ArrayList<Muniemon> listaMuniemones, int munion) {//Funcion que utilizo para chequear que la vida del Munion sea > 0
		boolean estaVivoMunion1 =  false;
		
		if(listaMuniemones.get(munion).getVida()> 0) {
			estaVivoMunion1 = true;
		}
		return estaVivoMunion1;
	}
	
	public static void atacarMuniemon(ArrayList<Muniemon> listaMuniemones, int munion1, int munion2) {
		//Antes que nada voy a chequear que los Muniones tengan vida suficiente para luchar:
		
		if(estaVivo(listaMuniemones, munion1) && estaVivo(listaMuniemones, munion2)) {
			//esta funcion va a hacer que el munion1 ataque al munion2
			int ataque = listaMuniemones.get(munion1).getAtaque();
			int defensa = listaMuniemones.get(munion2).getDefensa();
			ataque = ataque - defensa;
		
			System.err.println("El daño producido será = //// " + ataque +" \\\\");
			int vidaFinalM2 = listaMuniemones.get(munion2).getVida();
			vidaFinalM2 = vidaFinalM2 - ataque;
		
			System.out.println("El munion número: " + munion2 + " con nombre: " + listaMuniemones.get(munion2).getNombre()
				+ " tenía: " + listaMuniemones.get(munion2).getVida() + " de vida");
		
			listaMuniemones.get(munion2).setVida(vidaFinalM2);  //cambio el valor de la vida del Munion
		
			System.out.println("Ahora quedó con: " + listaMuniemones.get(munion2).getVida() + " de vida" );
			if(listaMuniemones.get(munion2).getVida() <= 0) {
				System.err.println("--------------FATALITY--------------");
				System.err.println("--------------FATALITY--------------");
				System.out.println("EL MUNION " + munion2 + " HA MUERTO" );
				System.err.println("--------------FATALITY--------------");
				System.err.println("--------------FATALITY--------------");
				System.out.println("MUNION " + munion1 + " WINS THE BATTLE");
			}
		
		}else {
			if(estaVivo(listaMuniemones, munion1) == false) {
				System.out.println("El Munion 1 esta muerto, no se encuentra apto para luchar, por favor escoja a otro para luchar");
			}
			if(estaVivo(listaMuniemones, munion2) == false) {
				System.out.println("El Munion 2 esta muerto, no se encuentra apto para luchar, por favor escoja a otro para luchar");
			}
		}
		
		
		
	}
}
