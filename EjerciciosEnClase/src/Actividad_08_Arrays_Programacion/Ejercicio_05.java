package Actividad_08_Arrays_Programacion;

import java.util.Scanner;

public class Ejercicio_05 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ejercicio 5: cargar los datos de un array a mano y luego eliminar los repetidos");
			System.out.println("Luego imprimir por pantalla el nuevo array");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Ingrese el tamaño de su array:");
			int tamanioA1 = sc.nextInt();
			int[] array1 = cargarArray(tamanioA1); //FUNCION CARGAR ARRAY
			
			System.out.println("Su array normal es:"); //IMPRIMO ARRAY1
			for (int elemento : array1) {
		            System.out.print("(" + elemento +")" + " - ");
		    }
			
			//PARTE EVALUAR NÚMEROS PARA SABER CANTIDAD REPETIDOS
			int repetidos = recorrerYcomparar(array1); //funcion que me devolverá cuantos elementos repetidos hay;
			//System.out.println(repetidos); //imprimo para verificar que el número sea correcto y la función este bien
			//Con esto ya sabemos el tamaño del nuevo array::::::: tamanioA1 - repetidos;
			//creamos el nuevo array
			int tamanioA2 = tamanioA1- repetidos;
			
			int[] array2 = cargarArraySinRepetidos(tamanioA2, array1); //llamo a la función cargarArraySinRepetidos para cargar el 2do array
			//debo pasarle 2 parametros de entrada: el tamanio de mi nuevo array2 Y TAMBIEN el array anterior para que compare los elementos y los copie al 2do
			
			System.out.println("ARRAY2, SIN ELEMENTOS REPETIDOS: ");
			for (int elemento : array2) { //IMPRIMO ARRAY2
	            System.out.print("(" + elemento +")" + " - ");
			}
			
			sc.close();
		}
		
		
		
		
		public static int[] cargarArray(int tamanio){ //CARGAMOS EL 1er ARRAY A MANO
			Scanner sc = new Scanner(System.in);
	        int array1[]=new int [tamanio];
	        for(int i=0;i<array1.length;i++){
	        	System.out.println("Cargue el: " + i +"° del array");
	            array1[i] = sc.nextInt();
	        }
	        return array1;
	    }

		
		public static int recorrerYcomparar(int array1Comparado[]) { //Función que nos va a decir cuantos elementos hay iguales
			int cantRepetidos = 0;
			for(int i = 0; i < array1Comparado.length -1; i++) { //primer bucle para recorrer todos los elementos del array
				for(int j = i+1 ; j < array1Comparado.length; j++ ) { //segundo bucle para que cada elemento se compare con los anteriores
					if(array1Comparado[i] == array1Comparado[j]) { //NOTESE, que la j = i+1__ porque?___el primer elemento nunca va a ser igual a ninguno por ser el primero, 
						//ademas siempre comparamos los elementos con sus siguientes__porque?__
						cantRepetidos++;
						break;  //no quedó otra que hacer un break para evitar conteos repetidos(sale de la iteración del FOR chico, NO del grande)
					}
						
				}
			}
			System.out.println("La cantidad de repetidos es: " + cantRepetidos);
			
			return cantRepetidos;
		}
		
		
		public static int[] cargarArraySinRepetidos(int tamanioA2, int array1[]) { //EN esta función vamos a cargar los datos que no se repiten
											//para eso tenemos que evaluar cada elemento con sus anteriores como hicimos arrbia,
			int posicionArray = tamanioA2;								//de cumplirse cargaremos ese dato en el nuevo array, y sino nada.
			Scanner sc = new Scanner(System.in);
	        int array2[]=new int [tamanioA2];
	        for(int i = array1.length -1; i >= 0 ; i--) {
	        	boolean repetido = false;
	        	
	        	
	        	for(int j = i-1; j>=0; j--) {
	        		if(array1[i]== array1[j]) {
	        			repetido = true;
	        		}
	        	}
	        	if(repetido == false) {
	        			array2[posicionArray-1] = array1[i];
	        			posicionArray--;
	        		}	
	        	
	        	
	        }
	        
	        
			return array2;
		}
		
		
		
		/*COMENTARIOS*/{
			//NUESTROS EJEMPLO DE ARRAY[6] ES: [1 - 2 - 3 - 1 - 2 - 1] La cantidad de repetidos es: 3
			//						POSICION    0   1   2   3   4   5
			//ARRAY2[6-3 = 3] : [1 - 2 - 3]
			//las i y las j marcan las posiciones, los valores los elementos del array
			
			//i=0 valor: 1
				//j=0+1 valor:2
					//comparo si 1==2---- false----> no sumo contador de repetidos
				//j=0+1+1 valor: 3
					//comparo si 1==3---- false----> no sumo contador de repetidos
				//j=0+1+1+1 valor: 1
					//comparo si 1==1--- true----> sumo contador de repetidos
						//salgo de la iteración del bucle j
			//---------------------------------------------------------------------------------------
			//i=1 valor: 2
				//j=1+1 valor: 3
					//comparo si 2==3---- false----> no sumo contador de repetidos
				//j=1+1+1 valor: 1
					//comparo si 2==1---- false----> no sumo contador de repetidos
				//j=1+1+1+1 valor: 2
					//comparo si 2==2---- true-----> sumo contador de repetidos
						//salgo de la iteración del bucle j
			//---------------------------------------------------------------------------------------
			//i=2 valor:3
				//como el 3 no se repite nunca, va a recorrer los 2 bucles enteros y va a dar una vuelta sin salir de las iteraciones ni sumar el contador
			//---------------------------------------------------------------------------------------
			//i=3 valor:1 de vuelta
				//j=3+1 valor 2
					//comparo si 1==2---- false----> no sumo contador de repetidos
				//j=3+1+1 valor:1
					//comparo si 1==1---- true----> sumo contador de repetidos y salgo del bucle
			//---------------------------------------------------------------------------------------
			//i=4 valor:1 de vuelta
			//POR ENDE,LA FUNCION VA A IR DESDE LA POSICION QUE MARQUE I HASTA QUE EL NUMERO SE REPITA, LUEGO SI SE VUELVE A REPETIR, IRÁ DESDE ESA POSICIÓN HASTA 
			//LA PRÓXIMA REPETICIÓN, Y DE NO REPETIRSE
			}
	}