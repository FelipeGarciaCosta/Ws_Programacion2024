package mapasHash;

import java.util.ArrayList;
import java.util.HashMap;

public class _01_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Double> hashmapCiudadTemperatura = new HashMap<>();

		hashmapCiudadTemperatura.put("Madrid", 10.0);
		hashmapCiudadTemperatura.put("Barcelona", 11.0);
		
		double temperaturaMAD= hashmapCiudadTemperatura.get("Madrid");
		
		System.out.println(temperaturaMAD);
		
		//es case sensitive
		//si se accede a un indice que no existe devuelve nulo
		//si se quiere recorrer es con una funcion lambda
		
		hashmapCiudadTemperatura.forEach((k,v) ->{
			System.out.println("clave: " + k.toString());
			System.out.println("valor: " + v.toString());
		});
		
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Gallego");
		listaNombres.add("Guillermito");
		listaNombres.add("Marquitos");
		
		
		//funcion Lambda
		listaNombres.forEach(v -> System.out.println("Nombre: " + v));
		
		//si ponemos la misma clave el valor se sobreescribe
		hashmapCiudadTemperatura.put("Madrid", (double)7);
		System.out.println("Madrid sobreescrito: "+hashmapCiudadTemperatura.get("Madrid"));
		
		var numero1 = 34.0;
		System.out.println(numero1);
		//inferencia de tipos, Java soporta la inferencia de tipos:
		//esta característica permite definir el tipo de la variable en el momento de asignar el primer valor,
		//pero ojo, NO se puede cambiar. no confundir con la cosa esa rara de javaScript
		
		//los tipos iniferidos son solo para las variables, NO PARA LOS ATRIBUTOS DE CLASE
		
		 
		
		
		
	}

}
