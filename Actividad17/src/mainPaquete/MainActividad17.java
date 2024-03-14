package mainPaquete;

import java.util.ArrayList;

import entidad.Ordenador;
import entidad.Periferico;
import entidad.PlacaBase;
import entidad.Procesador;
import entidad.RAM;
import entidad.TarjetaGrafica;

public class MainActividad17 {

	public static void main(String[] args) {
		
		//Se deberá crear un ordenador con
		//1 tarjeta gráfica(con su RAM)
		//1 placa base
		//4 módulos RAM
		//3 periféricos
		
		//Creamos la Tarjeta Gráfica
		TarjetaGrafica tg = new TarjetaGrafica();
		tg.setMarca("NVidia");
		tg.setModelo("GT 71");
		tg.setNucleosCUDA(3);
		tg.setPrecio(56.99);
		
		Procesador proc = new Procesador();
		proc.setMarca("RYZEN");
		proc.setModelo("AMD5");
		proc.setNumeroNucleos(4);
		proc.setPrecio(55.99);
		
		
		//Creamos la RAM de la TarjetaGrafica
		RAM rmTG = new RAM();
		rmTG.setCapacidad(16);
		rmTG.setMarca("NVidia");
		rmTG.setPrecio(56.99);
		tg.setRam(rmTG); //Le paso el objeto RAM creado al objeto TarjetaGrafica, lo enlazamos
		
		PlacaBase pb = new PlacaBase();
		pb.setMarca("ASUS");
		pb.setPrecio(62.00);
		pb.setTipo("A520M");
		
		//Creamos las 4 RAMs
		RAM ram1 = new RAM();
		ram1.setCapacidad(16);
		ram1.setMarca("NVidia");
		ram1.setPrecio(56.99);
		
		RAM ram2 = new RAM();
		ram2.setCapacidad(16);
		ram2.setMarca("NVidia");
		ram2.setPrecio(56.99);
		
		RAM ram3 = new RAM();
		ram3.setCapacidad(16);
		ram3.setMarca("NVidia");
		ram3.setPrecio(56.99);
		
		RAM ram4 = new RAM();
		ram4.setCapacidad(16);
		ram4.setMarca("NVidia");
		ram4.setPrecio(56.99);
		
		
		Periferico per1 = new Periferico();
		per1.setMarca("DELL");
		per1.setPrecio(19.99);
		per1.setTipo("teclado");
		
		Periferico per2 = new Periferico();
		per2.setMarca("DELL");
		per2.setPrecio(25.99);
		per2.setTipo("mouse");
		
		Periferico per3 = new Periferico();
		per3.setMarca("DELL");
		per3.setPrecio(100.99);
		per3.setTipo("monitor");
		
		ArrayList<RAM> listaRAMOrdenador = new ArrayList<RAM>();
		listaRAMOrdenador.add(ram1);
		listaRAMOrdenador.add(ram2);
		listaRAMOrdenador.add(ram3);
		listaRAMOrdenador.add(ram4);
		
		ArrayList<Periferico> listaPerifericosOrdenador = new ArrayList<Periferico>();
		listaPerifericosOrdenador.add(per1);
		listaPerifericosOrdenador.add(per2);
		listaPerifericosOrdenador.add(per3);
	
		Ordenador o1 = new Ordenador();
		o1.setListaPerifericos(listaPerifericosOrdenador);
		o1.setListaRAMs(listaRAMOrdenador);
		o1.setPlacaBase(pb);
		o1.setProcesador(proc);
		o1.setTarjetaGrafica(tg);
		o1.calcularPrecio();
		
		System.out.println(o1);
		
	}

}
