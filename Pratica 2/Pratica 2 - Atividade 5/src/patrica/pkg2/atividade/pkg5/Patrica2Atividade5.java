/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg2.atividade.pkg5;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica2Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int X, Y, Z; 
            
       


        System.out.print("Digite o lado X:");
        X = entrada.nextInt();
        
        System.out.print("Digite o lado Y:");
        Y = entrada.nextInt(); 
        
        System.out.print("Digite o lado Z:");
        Z = entrada.nextInt();
     
      
      if (X==0 && Y==0 && Z==0){
          System.out.println("Não são lados validos para um triangulo");
           
      }
      else if (Y > X+Z){
          System.out.println("Não são lados validos para um triangulo");
      
      }
      else if (Z > X+Y){
          System.out.println("Não são lados validos para um triangulo");
      
      }
      else if(X > Y+Z){
          System.out.println("Não são lados validos para um triangulo");
      }
              
      else {
          System.out.println("São valores validos para um triangulo");
      
      }
    }
    
}
