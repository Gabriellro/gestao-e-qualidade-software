/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrica.pkg1.atividade1;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Patrica1Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a, dma, dme;
        Scanner cv = new Scanner(System.in);
        System.out.println("Digite o valor do lado Diagonal Maior: ");
        dma=cv.nextFloat();
        System.out.println("Digite o valor do lado Diagonal Menor: ");
        dme=cv.nextFloat();
        
        a = (dma * dme) / 2;
        
        System.out.println("A área do losango: " + a );
    }
}

        // TODO code application logic here
    
    

