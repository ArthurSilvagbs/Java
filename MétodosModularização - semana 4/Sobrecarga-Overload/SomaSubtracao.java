package MetodosComRetorno;

import java.util.Scanner;

public class SomaSubtracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        int soma = somar(n1, n2);
        int subtracao = subtrair(n1, n2);

        System.out.printf("%d + %d = %d%n", n1, n2, soma);
        System.out.printf("%d - %d = %d%n", n1, n2, subtracao);

        sc.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }
}
