/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg9.atividade.pkg1;

import java.util.Scanner;
public class Pratica9Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        try{
        System.out.println("Digite o primeiro número inteiro");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        num2 = entrada.nextInt();
        int divisao = num1/num2;
        System.out.println("A divisão entre esses dois números é: " + divisao);
    } catch(ArithmeticException erro) {
        System.out.println("Nenhum número pode ser divido por 0, tente novamente");
    }

    }
}