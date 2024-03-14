
public class arrays {

	public static void main(String[] args) {
		//Los arrays "arrayNumeros" y "arrayNumeros2" son totalmente equivalentes
		
		//hay 2 formas de definir un array: la primera es la más larga
		//FORMA 1
		
		int [] arrayNumeros = new int[5]; //Declaro el array(le doy el tamaño)
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 2;
		arrayNumeros[2] = 3;
		arrayNumeros[3] = 4;
		arrayNumeros[4] = 5; //Le doy valor a cada posición del array(Inicialización)
		
		//----------------------------------------------------------------------------------------------------------------------------------------
		//FORMA 2
		
		int [] arrayNumeros2 = {1,2,3,4,5}; //Declaración e Inicialización en una línea---> defino el tamaño y los valores del array en una sola sentencia
		
		//----------------------------------------------------------------------------------------------------------------------------------------
		
		System.out.println("valor del array: " + arrayNumeros[0] ); // accedor a la primera posición del ARRAY---> las posiciones del array van desde el 0  hasta 
		System.out.println("valor del array: " + arrayNumeros[1] ); // el tamaño del array -1
		System.out.println("valor del array: " + arrayNumeros[2] );
		System.out.println("valor del array: " + arrayNumeros[3] );
		System.out.println("valor del array: " + arrayNumeros[4] );
		
		//ahora vamos a recorrer e imprimir el array con un bucle
		for(int i = 0; i < arrayNumeros2.length ; i++) {
			System.out.println("valor array2 " + arrayNumeros2[i]);
		}
		
	}

}
