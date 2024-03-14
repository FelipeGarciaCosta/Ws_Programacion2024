package Entidades;

public class Jardin {
	
	double cantMetros;
	int numeroPlantas;
	
	public Jardin() {
		super();
	}
	
	public Jardin(double cantMeTros, int numeroPlantas) {
		super();
		this.cantMetros = cantMeTros;
		this.numeroPlantas = numeroPlantas;
	}

	@Override
	public String toString() {
		return "Jardin [cantMeTros=" + cantMetros + ", numeroPlantas=" + numeroPlantas + "]";
	}

	public double getCantMeTros() {
		return cantMetros;
	}

	public void setCantMeTros(double cantMeTros) {
		this.cantMetros = cantMeTros;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	
}
