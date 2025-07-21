package While;

import java.util.Scanner;

public class ContadorDe1aN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("O número digitado era menor que 0. O programa será encerrado agora.");
            return;
        }

        int contador = 1;

        while (contador <= num) {
            System.out.print(contador + " ");
            contador++;
        }

        sc.close();

    }

}
