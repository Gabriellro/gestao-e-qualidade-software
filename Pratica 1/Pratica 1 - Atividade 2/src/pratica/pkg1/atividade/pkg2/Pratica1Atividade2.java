/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg1.atividade.pkg2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Pratica1Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        float c, f;
        
        System.out.println("Informe a temperatura em graus Celsius: ");
        c = input.nextFloat();
        
        System.out.println("A temperatura em Fahrenheit: "+((9*c+160)/5));
        
    }
    
}