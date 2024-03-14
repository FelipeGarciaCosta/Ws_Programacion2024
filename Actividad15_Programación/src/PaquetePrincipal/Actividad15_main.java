package PaquetePrincipal;

import java.util.Scanner;

public class Actividad15_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Entidad_Empresa[] arrayEmpresas = new Entidad_Empresa[2];
		
		System.out.println("Crearemos la 1ERA empresa:");
		Entidad_Empresa e1 = new Entidad_Empresa();
		
		System.out.println("Ingrese nombre de la empresa: ");
		e1.nombre = sc.nextLine();
		System.out.println("Ingrese nif de la empresa: ");
		e1.nif = sc.nextLine();
		
		
		System.out.println("Crearemos los 3 trabajadores de la empresa 1");
		
		e1.listaTrabajadores = new Entidad_Trabajador[3];
		
		for (int j = 0; j < 3; j++) {
			e1.listaTrabajadores[j] = new Entidad_Trabajador();
			System.out.println("Ingrese nombre");
			e1.listaTrabajadores[j].nombre = sc.nextLine();
			System.out.println("Ingrese dni");
			e1.listaTrabajadores[j].dni = sc.nextLine();
			/*System.out.println("el dni esta bien?" + e1.listaTrabajadores[j].validarDNI()); */
			System.out.println("Ingrese salario");
			e1.listaTrabajadores[j].salario = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println(e1.toString());
		
		
		sc.nextLine();
		System.out.println("Crearemos la 2da empresa:");
		Entidad_Empresa e2 = new Entidad_Empresa();
		
		System.out.println("Ingrese nombre de la empresa: ");
		e2.nombre = sc.nextLine();
		System.out.println("Ingrese nif de la empresa: ");
		e2.nif = sc.nextLine();
		
		
		System.out.println("Crearemos los 3 trabajadores de la empresa 1");
		
		e2.listaTrabajadores = new Entidad_Trabajador[3];
		
		for (int j = 0; j < 3; j++) {
			e2.listaTrabajadores[j] = new Entidad_Trabajador();
			System.out.println("Ingrese nombre");
			e2.listaTrabajadores[j].nombre = sc.nextLine();
			System.out.println("Ingrese dni");
			e2.listaTrabajadores[j].dni = sc.nextLine();
			System.out.println("Ingrese salario");
			e2.listaTrabajadores[j].salario = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println(e2.toString());
		
		arrayEmpresas[0] = e1;
		arrayEmpresas[1] = e2;
		for (Entidad_Empresa j : arrayEmpresas) {
			System.out.println(j.toString());
			j.mostrarDatosTrabajador();
			System.out.println("EXISTE TRABAJADOR ON DNI 55409438T ? " + j.existeTrabajador("55409438T"));
			System.out.println("Cantidad de trabajadores de la empresa:" + j.nombre + " " + j.cantTrabajadores());
			System.out.println("Cantidad gastada en sueldos de la empresa:" + j.nombre + " " + j.cantidadEnSueldos());
			System.out.println("Cantidad de trabajadores que cobran mas de 	3K:" + j.nombre + " " + j.cuantosCobran3K());
			System.out.println("Cantidad de trabajadores que cobran menos que el SMI de la empresa:" + j.nombre + " " + j.cuantosCobranMenosSMI());
			System.out.println("Cantidad de trabajadores que cobran mas de 1500 de la empresa:" + j.nombre + " " + j.cuantosCobranMasQue(1500));
			System.out.println("Todos los trabajadores tienen dni valido: " + j.todosDniValido());
			System.out.println("Las empresas son iguales? : " + j.sonIgualesEmpresas(e2));
		}
		
		
		sc.close();
	}
	


}
