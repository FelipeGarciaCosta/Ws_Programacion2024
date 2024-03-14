package Actividad05_Package;



public class Ejercicio_4 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 4: sumar los primeros 100 números naturales cuek");
		
		int suma = 0;
		for(int i = 1; i <= 100; i++) {
			
			suma += i;
			//System.out.println(suma);
			if(i==100) {
				System.out.println("Los números del 1 al 100 sumados son:" + suma);
			}
		} 
		
		//Utilizando GAUSS sería algo así
		
		for(int i = 1; i<=100;i++) {
			suma = i*(i+1)/2;
			if(i==100) {
				System.out.println("Los números del 1 al 100 utilizando Gauss son:" + suma);
			}
		}

	}

}
