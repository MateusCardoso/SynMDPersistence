Para execu��o dentro do ambiente Eclipse:

- Instalar Java runtime (se ainda n�o estiver instalado)
- Instalar o eclipse (http://www.eclipse.org)
- Executar eclipse pela primeira vez, escolher a pasta de workspace.
- Copiar este diret�rio para a pasta workspace.
- V� em eclipse->import. Escolhe Import existing projects. Selecione a pasta deste projeto.
- Clique com o botao da direita nos arquivos .launch e selecione o menu Run As... 
  OU
  expanda a pasta src at� o arquivo de exemplo a executar, clique com o botao da direita, selecione Run As e escolha Java Application
  
Para execu��o por linha de comando

- Instalar Java runtime (se ainda n�o estiver instalado)
- Descompactar o projeto (por exemplo c:\dev\aula ou /users/ATorres )
- Abra a linha de comando
- Chame o java runtime machine passando como par�metro o classpath e o projeto:
	java -cp <CLASSPATH> <CAMINHO COMPLETO PARA A CLASSE>
	
	sendo que o classpath deve apontar para a pasta "bin"
	
	No Windows:
	java -cp c:\dev\aula\AtivDidat\bin br.ufrgs.inf.ex1.Exemplo1
	No (Li)(U)nix:
	java -cp /users/ATorres/AtivDidat/bin br.ufrgs.inf.ex2.Exemplo2

	A classe deve ter o m�todo MAIN ou ocorrer� um erro.
	Aten��o para utilizar corretamente maiusculas e minusculas.


