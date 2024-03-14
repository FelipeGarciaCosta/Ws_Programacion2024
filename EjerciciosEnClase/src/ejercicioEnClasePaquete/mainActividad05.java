package ejercicioEnClasePaquete;

import java.util.Scanner;

public class mainActividad05 {

	public static void main(String[] args) {
		//ejercicio 01
		System.out.println("LLAMO A LA FUNCION MENU 3 VECES DESDE EL MAIN");
		menu();
		//menu();
		//menu();
		
		//Ejercicio 02
		System.out.println("Ahora llamaré a la función perímtero");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su Base (numero entero)");
		int base = sc.nextInt();
		System.out.println("ingrese su Altura (numero entero)");
		int altura = sc.nextInt();
		perimetro(base, altura);
		System.out.println("------------------------------------------------------------------------");
		int baseBH = 5;
		int alturaBH = 10;
		perimetro(baseBH, alturaBH);
		System.out.println("------------------------------------------------------------------------");
		
		//Ejercicio 03
		int perimetroEj3_2 = perimetroEjercicio3(base, altura);
		System.out.println("Su perímetro calculado con variables dadas por el usuario es y devuelto como parámetro de salida(return) es: " + perimetroEj3_2);
		System.out.println("------------------------------------------------------------------------");
		int perimetroEj3 = perimetroEjercicio3(baseBH,alturaBH);
		System.out.println("Su perímetro calculado con variables ya definidas, pero devuelto como un parámetro de salida(return) es: " + perimetroEj3);
		System.out.println("------------------------------------------------------------------------");
		
		//Ejercicio 04
		System.out.println("Ahora llamaré a la función AREA"); 
		System.out.println("ingrese su Base del rectángulo (numero entero)");
		int baseRec = sc.nextInt();
		System.out.println("ingrese su Altura del rectángulo (numero entero)");
		int alturaRec = sc.nextInt();
		int area = area(baseRec, alturaRec);
		System.out.println("Su area calculada es: " + area);
		System.out.println("------------------------------------------------------------------------");
		int alturaRec2 = 10;
		int baseRec2 = 7;
		int area2 = area(baseRec2 , alturaRec2);
		System.out.println("Su area con variables ya definidas es: " + area2);
		System.out.println("------------------------------------------------------------------------");
		
		//Ejercicio 05
		System.out.println("Ahora llamaré a la función HIPOTENUSA");
		System.out.println("ingrese su Base del Triángulo ");
		double baseTrinangulo = sc.nextInt();
		System.out.println("ingrese su Altura del Triángulo ");
		double alturaTriangulo = sc.nextInt();
		double hipotenusaTriangulo = hipotenusa(baseTrinangulo,alturaTriangulo);
		System.out.println("La hipotenusa del Triángulo Rectángulo que se forma dada la base y su altura es: " + hipotenusaTriangulo);
		System.out.println("------------------------------------------------------------------------");
		double baseTriangulo2 = 15;
		double alturaTriangulo2 = 25;
		double hipotenusaTriangulo2 = hipotenusa(baseTriangulo2,alturaTriangulo2);
		System.out.println("La hipotenusa del Triángulo Rectángulo con variables ya definidas es: " + hipotenusaTriangulo2);
		System.out.println("------------------------------------------------------------------------");
		
		//Ejercicio 06
		System.out.println("Ahora llamaré a la función SUMA, RESTA, DIVISIÓN Y MULTIPLICACIÓN");
		System.out.println("ingrese su Numero 1 ");
		double numero1 = sc.nextInt();
		System.out.println("ingrese su Numero 2 ");
		double numero2 = sc.nextInt();
		double suma = suma(numero1,numero2);
		double resta = resta(numero1,numero2);
		double division = division(numero1,numero2);
		double multiplicacion = multiplicacion(numero1,numero2);
		System.out.println("La SUMA de sus numeros es: " + suma + " ....la resta es: " + resta + " ..... la division es: " + division + " .... la multiplicacion es: " + multiplicacion);
		System.out.println("------------------------------------------------------------------------");
		
		/*ACA LLAMO DE VUELTA A LA FUNCION SUMA/RESTA/DIVISION/MULTIPLICACION CON OTROS PARAMETROS ejercicio 6
		double numero3 = 15250.25;
		double numero4 = 251.0325;
		double suma = suma(numero3,numero4);
		double resta = resta(numero3,numero4);
		double division = division(numero3,numero4);
		double multiplicacion = multiplicacion(numero3,numero4);
		 */
	
		//Ejercicio 07
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Ahora llamaré a la función MEDIA de 3 números ");
		System.out.println("ingrese su Numero 1 ");
		double numeroMedia1 = sc.nextInt();
		System.out.println("ingrese su Numero 2 ");
		double numeroMedia2 = sc.nextInt();
		System.out.println("ingrese su Numero 3 ");
		double numeroMedia3 = sc.nextInt();
		mediaDeTres(numeroMedia1, numeroMedia2, numeroMedia3);
		/*
		AQUI VUELVO A LLAMAR A LA FUNCION mediaDeTres con parametros diferentes
		double numeroMEDIA3 = 15250.25;
		double numeroMEDIA4 = 251.0325;
		double numeroMEDIA5 = 251.0325;
		mediaDeTres(numeroMEDIA3, numeroMEDIA4, numeroMEDIA5);
		 */
		
		//Ejercicio 08
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Ahora llamaré a la función CALCULADORA DE NOTA ");
		System.out.println("ingrese su examen Parcial 1: ");
		double examen1 = sc.nextDouble();
		
		System.out.println("ingrese su examen Parcial 2: ");
		double examen2 = sc.nextDouble();
		
		System.out.println("ingrese su examen Parcial 3: ");
		double examen3 = sc.nextDouble();
		
		System.out.println("ingrese su examen Final: ");
		double examenFinal = sc.nextDouble();
		
		System.out.println("ingrese su Trabajo Final: ");
		double trabajo = sc.nextDouble();

		double notaFinal = calculadoraNotaFinal(examen1,examen2,examen3,examenFinal,trabajo);
		System.out.println("SU CALIFICACIÓN FINAL ES: " + notaFinal );
		
		/*
		AQUI VUELVO A LLAMAR A LA FUNCION calculadoraNotaFinal con parametros diferentes
		double examen1 = 15250.25;
		double examen2 = 251.0325;
		double examen3 = 251.0325;
		double examenFinal = 251.0325;
		double trabajo = 251.0325;
		double notaFinal = calculadoraNotaFinal(examen1,examen2,examen3,examenFinal,trabajo);
		System.out.println("SU CALIFICACIÓN FINAL ES: " + notaFinal );
		 */
		
		//Ejercicio 09
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Ahora llamaré a la función SUELDO DEL TRABAJADOR ");
		System.out.println("Ingrese su sueldo Base: ");
		double sueldoBase = sc.nextDouble();
		System.out.println("ingrese sus horas extra trabajadas del mes: ");
		double horasExtra = sc.nextDouble();
		System.out.println("ingrese cuanto valen sus horas extras trabajadas:  ");
		double horasExtraValor = sc.nextDouble();
		sueldoTrabajador(sueldoBase, horasExtra, horasExtraValor );
		
		
		/*
		 Aqui vuelvo a llamar a la funcion sueldoTrabajador con parametros diferentes :)
		 double sueldoBase2 = 1453.2215;
		 double horasExtra2 = 457887.25;
		 sueldoTrabajador(sueldoBase2, horasExtra2);
		 */
		sc.close() ;
		System.out.println("---------FIN DEL PROGRAMA MUCHAS GRACIAS POR PARTICIPAR------------");
		
	}
	
	
	//ejercicio 1
	public static void menu() {
		System.out.println("1. Entrar en la Aplicación");
		System.out.println("2. Registrarse en la Aplicación");
		System.out.println("3. Salir del Programa");
	}
	
	//ejercicio 2
	public static void perimetro(int base, int altura) {
		int perimetro = (2*base) + (2*altura);
		System.out.println("El 1er perimetro es con variables dadas por el usuario y el 2do es por variables ya definidas:" +  perimetro);
	}
	
	//ejercicio 3
	public static int perimetroEjercicio3 (int base, int altura) {
		int perimetro = (2*base) + (2*altura);
		//System.out.println("su perimetro es:" +  perimetro);
		return perimetro;
	}
	
	//ejercicio 4
	public static int area (int base, int altura) {
		int area = base * altura ;
		return area;
	}

	//ejercicio 5
	public static double hipotenusa(double base, double altura) {
		double hipotenusa = Math.sqrt((base*base) + (altura*altura)); //Math.sqrt = Raíz cuadrada
		return hipotenusa;
	}
	
	//ejercicio 6
	public static double suma(double numero1, double numero2) {
		double suma = numero1 + numero2;
		return suma;
	}
	public static double resta(double numero1, double numero2) {
		double resta = numero1 - numero2;
		return resta;
	}
	public static double division(double numero1, double numero2) {
		double division = numero1/numero2;
		return division;
	}
	public static double multiplicacion(double numero1, double numero2) {
		double multiplicacion = numero1*numero2;
		return multiplicacion;
	}
	 
	//ejercicio 7
	public static void mediaDeTres(double numero1, double numero2, double numero3) {
		double media = (numero1+numero2+numero3)/3 ;
		System.out.println("LA MEDIA DE LOS 3 NUMEROS ES: " + media);
	}
	
	//ejercicio 8
	public static double calculadoraNotaFinal(double examen1,  double examen2, double examen3, double examenFinal, double trabajo) {
		double calificacionFinal = ((55*(examen1+examen2+examen3)/300) + ((30*examenFinal)/100) +((15*trabajo)/100));
		return calificacionFinal;
	}
	
	//ejercicio 9
	public static void sueldoTrabajador(double sueldoBase, double horasExtra, double horasExtraValor) {
		double sueldoTotal = sueldoBase + (horasExtra*horasExtraValor);
		System.out.println("Su sueldo TOTAL del mes es: " + sueldoTotal);
	}
	
	
	
	
	
	
	
	
	
	
	
}