package IntroducciónClases;

public class referencias {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.años = 1;
		c1.electrico = false;
		c1.Marca = "Toyota";
		c1.Modelo = "Celica";
		c1.peso = 1500;
		c1.Matricula = "12345678X";
		
		Coche c2 = new Coche();
		c2.años = 3;
		c2.electrico = true;
		c2.Marca = "Tesla";
		c2.Modelo = "Lavadora 3";
		c2.peso = 1500;
		c2.Matricula = "87654321X";

		Coche c3 = new Coche();
		c3.años = 5;
		c3.electrico = false;
		c3.Marca = "Porsche";
		c3.Modelo = "GT 3";
		c3.peso = 1500;
		c3.Matricula = "246810X";
		
		System.out.println("Imprimimos la referencia del objeto c2");
		System.out.println(c2);
		
		imprimirValores(c1);
		imprimirValores(c2);
		imprimirValores(c3);
		
	}

	public static void imprimirValores(Coche referencias) { //la palabra coche representa el tipo de dato y la palabra referencia representa el nombre
		System.out.println("Años de antiguedad: " + referencias.años);
		System.out.println("Es eléctrico: " + referencias.electrico);
		System.out.println("Marca: " + referencias.Marca);
		System.out.println("Su matrícula es: " + referencias.Matricula);
		System.out.println("El modelo es: " + referencias.Modelo);
		System.out.println("El peso es: " + referencias.peso);
	}
	
}
