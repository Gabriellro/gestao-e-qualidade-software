package pratica.pkg2.atividade.pkg7;

import java.util.Scanner;

public class Pratica2Atividade7 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int cod; 
        
         System.out.println("digite o código do produto");
        cod=teclado.nextInt();
        
        switch(cod) {
        case 1: System.out.println("Sapato: R$ 99,99");
        break;
        case 2: System.out.println("Bolsa R$ 103,89");
        break;
        case 3: System.out.println("Camisa R$ 49,98");
        break;
        case 4: System.out.println("Calça R$ 89,72");
        break;
        case 5: System.out.println("Blusa R$ 97,35");
        break;
        default: System.out.println("produto inexistente");
        }
            
        teclado.close(); 
    }
    
}
