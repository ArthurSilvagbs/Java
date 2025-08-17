package MetodosVoid;

import java.util.Scanner;

public class VerificarDivisibilidadePor3Ou5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        verificarDivisibilidade(num);

        sc.close();
    }

    public static void verificarDivisibilidade(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.printf("O número %d é divisivel por 3 e por 5.%n", num);
        }
        else if (num % 3 == 0) {
            System.out.printf("O número %d é divisivel por 3.%n", num);
        }
        else if (num % 5 == 0) {
            System.out.printf("O número %d é divisivel por 5.%n", num);
        }
        else {
            System.out.printf("O número %d não é divisível nem por 3 nem por 5.%n", num);
        }

    }
}
