package _05_arrays;

public class MainObjetosArrays {

	public static void main(String[] args) {
		
		
		Restaurante r1 = new Restaurante();
		
		r1.id = 1;
		r1.nombre = "MC DONALDO";
		double[] pArray = new double[3];
		pArray[0] = 3.0;
		pArray[1] = 5.0;
		pArray[2] = 4.9;
		
		r1.puntuaciones = pArray;
		
		pArray[0] = 2.0;
		System.out.println(r1.puntuaciones[0]);
		
		Restaurante[] arrayRestaurantes;
		arrayRestaurantes = new Restaurante[3];
		
		arrayRestaurantes[0] = r1;
		arrayRestaurantes[0].puntuaciones[0] = 1.0;
		System.out.println(pArray[0]);
		
		r1 = new Restaurante();
		System.out.println(r1.puntuaciones[0]);
		
	}

}
