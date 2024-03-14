package Entidades;

public class Habitacion {

	private String nombre;
	private double cantMetros;
	private TipoHabitacion tipoHabitacion;
	
	public Habitacion() {
		super();
	}

	public Habitacion(String nombre, double cantMetros, TipoHabitacion tipoHabitacion) {
		super();
		this.nombre = nombre;
		this.cantMetros = cantMetros;
		this.tipoHabitacion = tipoHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", cantMetros=" + cantMetros + ", tipoHabitacion=" + tipoHabitacion
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantMetros() {
		return cantMetros;
	}

	public void setCantMetros(double cantMetros) {
		this.cantMetros = cantMetros;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
}
