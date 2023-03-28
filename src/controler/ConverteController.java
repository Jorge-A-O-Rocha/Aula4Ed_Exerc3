package controler;

import br.edu.fateczl.pilhaint.Pilha;

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public Pilha p = new Pilha();
	//public PilhaString ps = new PilhaString();
	
	public String decToBin(int decimal) throws Exception {
		
		 int numero = decimal;
	     String binario= "";
	     String binariocontrario = "";
		while(numero != 0  ) {
			p.push(decimal % 2);
			decimal = decimal / 2;
		}
		
		StringBuffer bin= new StringBuffer();

		while (!p.isEmpty()) {
			bin.append(p.pop());
		}
		
		return bin.toString();
	}
		

}


