package br.ufrgs.inf.ex3;

public class Exemplo3 {
	/**
	 * Cria um carro e imprime comiss�o
	 */
	public static void main(String[] args) {
		Produto carro;
		//Cria Produto
		carro = new Produto(45199.00,10);
		//imprime comiss�o
		System.out.println("comiss�o: "+carro.calculaComissao());
		
	}
}
