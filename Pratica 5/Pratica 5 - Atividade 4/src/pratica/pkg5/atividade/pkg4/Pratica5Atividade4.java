package pratica.pkg5.atividade.pkg4;

import javax.swing.JOptionPane;
public class Pratica5Atividade4 {


    public static void main(String[] args) {
        int num,fat=1;
         num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
         if(num<0)
             System.out.println("O número deve ser positivo");
         if(num==0) {
             System.out.printf("o fatorial de %d é:%d\n",num,1);
             return;
         }
         for(;num!=0;num--)
             fat*=num;
         System.out.printf("o fatorial de %d é:%d\n",num,fat);
    }

}