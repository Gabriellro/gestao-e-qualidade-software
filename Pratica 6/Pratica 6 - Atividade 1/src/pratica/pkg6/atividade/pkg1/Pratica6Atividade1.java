/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg6.atividade.pkg1;

import javax.swing.JOptionPane;
public class Pratica6Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int index, soma = 0;
		int[] vetor = new int[10];
		String numInt;

		
		for (index = 0; index < 10; index++) {
			numInt = JOptionPane.showInputDialog("Informe um número inteiro:");
			vetor[index] = Integer.parseInt(numInt);
		}

		
		numInt = "Vetor informado:\n";
		for (index = 0; index < vetor.length; index++)
			numInt += String.format(" vetor[%d]=%4d\n", index, vetor[index]);
		JOptionPane.showMessageDialog(null, numInt);

		
		for (int numPar : vetor)
			if (numPar % 2 == 0)
				soma += numPar;
		JOptionPane.showMessageDialog(null, "Soma dos números pares do vetor: " + soma);
	}
}


