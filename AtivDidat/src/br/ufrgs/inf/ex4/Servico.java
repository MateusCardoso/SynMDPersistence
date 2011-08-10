package br.ufrgs.inf.ex4;

/**
 * Servi�o � um produto contratado por um per�odo de 
 * um ou mais meses. 
 * @author Alexandre Torres
 */
public class Servico extends Produto {
	protected int nroMeses;
	public Servico(double valor,int comissao,int nroMeses) {	    
		super(valor,comissao);
		this.nroMeses = nroMeses;		
	}
	/**
	 * A comiss�o de servi�o � baseada no n�mero de meses 
	 * contratado e valor.
	 * @return comiss�o sobre valor
	 */
    public double calculaComissao() {
    	// faz um 'Override'
    	return nroMeses*super.calculaComissao();
    	//return nroMeses*valor*(comissao/100.0);
    }
}
