package br.ufrgs.inf.ex4;

public class Exemplo5 {
	/**
	 * Cria um carro e imprime comiss�o
	 */
	public static void main(String[] args) {		
		Servico meuServico = new Servico(250,10,3); 
		Produto meuProduto = meuServico;
		System.out.println("Comiss�o "+meuProduto.calculaComissao());
		System.out.println(" � igual a comiss�o "+meuServico.calculaComissao());
	}
}
