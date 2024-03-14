package main;

public class Coche {
	
	private int id;
	private String matricula;
	private String marca;
	

	private static int contadorID = 0;
	
	public static final String TOYOTA = "TOYOTA";
	public static final String RENAULT = "RENAULT";
	
	
	


	@Override
	public String toString() {
		return "coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}

	public Coche() {
		super();
		this.id = contadorID;
		contadorID++;
	}
	
	public static void mostrarContadorID() {
		System.out.println("El ContadorID es = " + Coche.contadorID);
	}
	
	public static void resetearContador() {
		Coche.contadorID = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static int getContadorID() {
		return contadorID;
	}

}
