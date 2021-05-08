
package pratica.pkg3.atividade.pkg2b;

import java.util.Scanner;
public class Pratica3Atividade2B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double comprimento, pi = 3.14, raio, area, volume;
        int cont=1;
        while (0 < cont) {
            System.out.println("Digite o raio da sua circunferência: ");
            raio = input.nextDouble();
            System.out.println(raio);
            comprimento = 2 * pi * raio;
            area = (pi * (raio * raio));
            volume = (0.75 * pi * (raio * raio * raio));
            System.out.println("O comprimento da sua circunferência é igual a: " + comprimento);
            System.out.println("A area da sua circunferência é igual a: " + area);
            System.out.println("O volume da sua circunferência é igual a: " + volume);
        }
    }

}

