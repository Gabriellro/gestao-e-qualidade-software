/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg1.atividade.pkg4;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica1Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        double cat1,cat2;
        System.out.println("Calculadora de Hipotenusa ");
        System.out.println("Insira o valor do 1º cateto: ");
        cat1=scan.nextDouble();
        System.out.println("Insira o valor do 2º cateto: ");
        cat2=scan.nextDouble();
        
        double hipo = Math.sqrt(Math.pow(cat1,2)+ Math.pow(cat2,2));
        
        System.out.println("O valor da Hipotenusa desses catetos, é igual a: "+hipo);
    }
    
}
