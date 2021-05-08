/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg1.atividade.pkg5;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica1Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner cv=new Scanner(System.in);
            double C, A, V, R;
        
            System.out.println("Digite o valor do Raio: ");
            R = cv.nextDouble();
        
            C = 2 * 3.14 * R;
        
            A = 3.14 * Math.pow(R,2);
        
            V =  (4 * 3.14 * Math.pow(R,2)) / 3;
        
            System.out.println("O comprimento da esfera é: " + C);
            System.out.println("A área da esfera é: " + A);
            System.out.println("O volume da esfera é: " + V);
    }
    
}
