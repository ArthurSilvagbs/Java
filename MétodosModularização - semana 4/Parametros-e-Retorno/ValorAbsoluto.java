package MetodosComRetorno;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.printf("Valor absoluto: %d", absoluto(n1));

        sc.close();
    }

    public static int absoluto(int n1) {
        if (n1 < 0) {
            return -n1;
        }
        else {
            return n1;
        }
    }
}
