/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg2.atividade.pkg2;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica2Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1,num2,num3,media;
    
      
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite primeira nota de 0 a 10:");
      num1 = teclado.nextInt();
      
      System.out.println("Digite segunda nota de 0 a 10:");
      num2 = teclado.nextInt();
      
      System.out.println("Digite terceira nota de 0 a 10:");
      num3 = teclado.nextInt();
      
      media = (num1+num2+num3)/3;
      
      if (media>=0 && media<3){
            System.out.println("Reprovado");}
      else if (media>=3 && media<7){
            System.out.println("Exame");}
      else if (media>=7 && media<=10){
            System.out.println("Aprovado");}
      
    }
    
}
