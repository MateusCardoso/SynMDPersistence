package br.ufrgs.inf.poker;

public class Mao {
	private Carta[] cartas;
	/**
	 * Construtor
	 * @param 5 cartas que formam a m�o
	 */
	public Mao(Carta[] cartas) {
		if (cartas.length!=5) 
			throw new RuntimeException("Uma m�o deve ter 5 cartas");
		for (Carta c: cartas) {
			if (c==null)
				throw new RuntimeException("carta nula");
		}
		this.cartas = cartas;		
	}
	/**
	 * Imprime as cartas de uma m�o
	 */
	public void print() {		
		for (Carta c: cartas) {
			if (c!=null)
				System.out.println(" "+c.toString()+ " ");
		}
		System.out.println(";");		
	}
}
