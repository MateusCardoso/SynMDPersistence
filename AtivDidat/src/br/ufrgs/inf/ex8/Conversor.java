package br.ufrgs.inf.ex8;

public class Conversor {
	//Constante
	public static final String TAIL = "&"; 
	public static final int TAMANHO_INICIAL = 50000;
	// vari�vel static
	private static Conversor obj;
	private StringBuffer buf;
	// m�todo est�tico
	public static Conversor getConversor() {
		if (obj==null)
			obj=new Conversor();
		return obj;
	}
	//construtor privado
	private Conversor() {	
		buf = new StringBuffer(TAMANHO_INICIAL);
	}
	//m�todo comum
	public char[] converter(String xx) {
		buf.append(xx+TAIL);
		return xx.toCharArray();
	}
}
