/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg6.atividade.pkg3;

import javax.swing.JOptionPane;
public class Pratica6Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int index, menor, maior;
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

		
		menor = vetor[0];
		maior = vetor[0];
		for (index = 1; index < vetor.length; index++) {
			if (vetor[index] < menor) {
				menor = vetor[index];
			} else {
				for (index = 1; index < vetor.length; index++) {
					if (vetor[index] > maior) {
						maior = vetor[index];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Menor valor informado: " + menor);
		JOptionPane.showMessageDialog(null, "Maior valor informado: " + maior);
	}
}
