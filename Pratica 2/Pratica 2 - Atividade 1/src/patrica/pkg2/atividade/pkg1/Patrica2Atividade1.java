/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg2.atividade.pkg1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica2Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        int A, B, C; 
            System.out.print("Verificador de Triângulo\n\n");


        System.out.print("Digite o lado A=");
        A = entrada.nextInt();
        
        System.out.print("Digite o lado B=");
        B = entrada.nextInt(); 
        
        System.out.print("Digite o lado C=");
        C = entrada.nextInt(); 


        if( A < B + C && B < A + C && C < A + B ){ 
            if(A==B && B == C){ //saber de A==B e se B==C, sendo verdade o triângulo é eqüilátero
                System.out.print("O triângulo é Eqüilátero.");
            }else if(A==B || A==C || B==C){ //Se não, verificar de A==B ou se A==C ou se B==C, sendo verdade o triângulo é isósceles
                System.out.print("O triângulo é Isósceles.");
            }else{ //e caso contrário, o triângulo será escaleno
                System.out.print("O triângulo é Escaleno.");
            }
        }else{ 
            System.out.print("Os lados fornecidos não caracterizam um triângulo");
        }

    }
    
}
