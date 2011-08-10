package br.ufrgs.inf.ex2;

public class Produto {
	protected double valor;
    protected int comissao;     
    public Produto(double valor,int comissao) {
    	this.valor = valor;
    	this.comissao = comissao;
    }
    /**
     * A comiss�o do produto � baseada no valor da venda
     * @return comiss�o sobre valor
     */
    public double calculaComissao() {
    	return valor*(comissao/100.0);
    }
}
