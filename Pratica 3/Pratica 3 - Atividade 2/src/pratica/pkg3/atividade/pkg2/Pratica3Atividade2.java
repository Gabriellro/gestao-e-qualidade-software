package pratica.pkg3.atividade.pkg2;

import javax.swing.JOptionPane;

public class Pratica3Atividade2 {

    public static void main(String[] args) {
        JOptionPane Input = new JOptionPane(System.in);
        float nota1, nota2, nota3, media;
        int cont=1;
       while(0<cont){
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(" Primeira nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(" Segunda nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(" Terceira nota: "));
        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 0 & media < 3) {
            JOptionPane.showMessageDialog(null, " REPROVADO ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);
        } else if (media >= 3 & media < 7) {
            JOptionPane.showMessageDialog(null, " EXAME ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);

        } else if (media >= 7 & media <= 10) {
            JOptionPane.showMessageDialog(null, " APROVADO ");
            JOptionPane.showMessageDialog(null, " Sua nota foi: " + media);
        }
       }
    }

}