package br.ufrgs.inf.ex2;

public class Exemplo2 {
	/**
	 * Cria um carro e imprime comiss�o
	 */
	public static void main(String[] args) {		
		Produto carro = new Produto(45199.00,10);
		Servico tvCabo = new Servico(90,5,12);		
		//imprime comiss�o
		System.out.println("Comiss�es \ncarro: "+carro.calculaComissao());
		System.out.println("Tv � cabo: "+tvCabo.calculaComissao());
		
	}
}
