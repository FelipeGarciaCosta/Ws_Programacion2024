package Actividad18;

public class Muniemon {

	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon TipoMuniemon;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public void setTipoMuniemon(TipoMuniemon tipoMuniemon) {
		TipoMuniemon = tipoMuniemon;
	}
	
	@Override
	public String toString() {
		return "Entidad_Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", TipoMuniemon=" + TipoMuniemon + "]";
	}
	
	
	
	
}



