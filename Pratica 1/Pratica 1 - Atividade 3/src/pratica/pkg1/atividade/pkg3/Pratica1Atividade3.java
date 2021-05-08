/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.pkg1.atividade.pkg3;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Pratica1Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner cv=new Scanner(System.in);
        
        float salariof, salariom=1100, resultado;
        
        System.out.println("Informe o salário do funcionário: ");
        salariof=cv.nextFloat();
        
        resultado = salariof / salariom;
        
        System.out.println("A quatidade de salário mínimo é: "+ resultado);
    }
    
}
