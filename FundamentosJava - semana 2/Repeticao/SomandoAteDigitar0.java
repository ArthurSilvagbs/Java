package While;

import java.util.Scanner;

public class SomandoAteDigitar0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int entrada = sc.nextInt();
        int soma = 0;

        while (entrada != 0) {
            soma += entrada;
            System.out.print("Digite um numero: ");
            entrada = sc.nextInt();
        }

        System.out.println("Soma: " + soma);

        sc.close();

    }
}
