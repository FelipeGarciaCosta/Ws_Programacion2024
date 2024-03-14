package paqueteObjetos;

import java.util.Scanner;

public class mainActividad13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EntidadUsuario[] usuarios = new EntidadUsuario[3]; //Creo el array que contenga 3 entidades usuario
		
		EntidadUsuario u1 = new EntidadUsuario(); //creo 3 entidades usuario
		EntidadUsuario u2 = new EntidadUsuario();
		EntidadUsuario u3 = new EntidadUsuario();

		usuarios[0] = u1;//valorizo el array usuarios
		usuarios[1] = u2;
		usuarios[2] = u3;

		
		//Llamo a todas las funciones pedidas 
		rellenarArrayUsuario(u1, sc);
		rellenarArrayUsuario(u2, sc);
		rellenarArrayUsuario(u3, sc);
		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
			System.out.println(usuarios[i].devolverMediaValoraciones());
			usuarios[i].mostrarValoraciones();
			System.out.println("Ingrese un número para saber la cantidad de números superiores a...");
			int numero = sc.nextInt();
			System.out.println("La cantidad de número superiores a: " + numero + " es: " + usuarios[i].devolverCantValoracionesSuperioresa(numero));
			System.out.println("Ingrese número para saber si ese número supera la media de las valoracioens ");
			numero = sc.nextInt();
			System.out.println("Supera la media el número: " + numero + ": " +usuarios[i].devolverSuperaMedia(numero));
		}
		
		
		//sc.close();
	}
	
	public static void rellenarArrayUsuario(EntidadUsuario entidadUsuario, Scanner sc ) {
		System.out.println("Ingrese id: ");
		entidadUsuario.id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Ingrese nombre");
		entidadUsuario.nombre = sc.nextLine();
		
		int tamanio = 0;
		System.out.println("Ingrese el tamaño del array: ");
		tamanio = sc.nextInt();
		
		double[] arrayValoraciones = new double[tamanio];
		entidadUsuario.valoraciones = arrayValoraciones;
		for(int i = 0; i < tamanio; i++) {
			System.out.println("Ingrese la valoracion número: " + i);
			entidadUsuario.valoraciones[i] = sc.nextDouble();
		}
		
		
	}
	


}
