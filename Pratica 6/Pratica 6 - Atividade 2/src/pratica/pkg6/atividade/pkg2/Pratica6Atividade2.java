/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg6.atividade.pkg2;

import javax.swing.JOptionPane;
public class Pratica6Atividade2 {

   
    public static void main(String[] args) {
                int index;
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

		
		numInt = "Posições contendo os negativos:\n";
		for (index = 0; index < vetor.length; index++)
			if (vetor[index] < 0)
				numInt += String.format("%d: vetor[%d] = %d\n", index, index, vetor[index]);
		JOptionPane.showMessageDialog(null, numInt);
	}
}

