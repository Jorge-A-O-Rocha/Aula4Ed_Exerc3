package view;

import javax.swing.JOptionPane;

import controler.ConverteController;

public class main {

	public static void main(String[] args) throws Exception {
		ConverteController converte = new ConverteController();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 0 a 1000 "));
		while(x < 0 || x > 1000 ) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 0 a 1000 "));

		}
		

		System.out.println(converte.decToBin(x));
		
	}

}
