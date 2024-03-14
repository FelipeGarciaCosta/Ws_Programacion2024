
package Entidades;

public class Direccion {
	private String tipoVia;
	private String nombreVia;
	private String localidad;
	private int CP;
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", localidad=" + localidad + ", CP=" + CP
				+ "]";
	}

	public Direccion() {
		super();
	}
	
	

	public Direccion(String tipoVia, String nombreVia, String localidad, int cP) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.localidad = localidad;
		CP = cP;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}
	
}

	
	
	
	

