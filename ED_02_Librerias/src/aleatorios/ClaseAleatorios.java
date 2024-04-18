package aleatorios;

import java.util.Random;

public class ClaseAleatorios {
	/**
	 * Returns a pseudorandomly chosen int value between the specified origin (inclusive) and the specified bound (inclusive).
	 * @param n1 Its the first number that will declare the range
	 * @param n2 Its the last number of the range
	 * @return a pseudorandomly chosen int value between theorigin (inclusive) and the bound (inclusive)
	 */
	public int numeroAleatorioEntreDosNumeros(int n1, int n2) {
		Random rn = new Random();
		int nAleatorio = rn.nextInt(n1, n2+1);
		return nAleatorio;
	}
	
	/**
	 * Método que genera un <b>número</b> aleatorio entre el 0 y el 2^32 
	 * @return
	 */
	public int numeroAleatorio() {
		Random rn = new Random();
		int nAleatorio = rn.nextInt();
		return nAleatorio;
	}
	
}
