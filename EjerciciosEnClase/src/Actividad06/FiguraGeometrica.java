package Actividad06;

public class FiguraGeometrica {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cálculo del ÁREA CUADRADO");
		System.out.println("-----------------------------------------------------");
		areaCuadrado(10,15);
		areaCuadrado(500.23,100);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cálculo del ÁREA TRIÁNGULO");
		System.out.println("-----------------------------------------------------");
		areaTriangulo(5,8,2);
		areaTriangulo(999999999L,2L,2);
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Cálculo del ÁREA CÍRCULO");
		System.out.println("-----------------------------------------------------");
		areaCirculo(15,3.1416);
		areaCirculo(152689L,3.1416);
		
		System.out.println("FIN DEL PROGRAMA");
		
		

	}
	
	
	public static void areaCuadrado(int base, int altura) {
		int area = base * altura;
		System.out.println("El área del cuadrado calculada con la función 1 es:"+ area);
	}

	public static void areaCuadrado(double base, double altura) {
		double area = base * altura;
		System.out.println("El área del cuadrado calculada con la función 2 es:"+ area);
	}
	
	public static void areaTriangulo(int base, int altura, int dos) {
		int area = (base * altura) /dos;
		System.out.println("El área del Triángulo calculada con la función 1 es:"+ area);
	}
	
	public static void areaTriangulo(long base, long altura, int dos) {
		long area = (base * altura)/ dos;
		System.out.println("El área del Triángulo calculada con la función 2 es:"+ area);
	}
	
	public static void areaCirculo(int radio, double pi) {
		double area = (radio*radio)* pi/2;
		System.out.println("El área del Círculo calculada con la funcion 1 es:"+ area);
	}
	
	public static void areaCirculo(long radio, double pi) {
		double area =(radio*radio)* pi/2;
		System.out.println("El área del Círculo calculada con la funcion 2 es:"+ area);
	}
	
}
