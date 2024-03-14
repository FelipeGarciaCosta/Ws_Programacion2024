package Actividad05_Package;


public class Ejercicio_7 {

	public static void main(String[] args) {
		System.out.println("Ejercicio 7: calcular la suma de los números pares del 1 al 50 ");
		int sumaNumPar = 0;
		for (int i = 2 ;i<=50;i +=2) {
			
			sumaNumPar += i;
			if(i==50) {
				System.out.println(sumaNumPar);
			}
			
			
		}
	}

}
