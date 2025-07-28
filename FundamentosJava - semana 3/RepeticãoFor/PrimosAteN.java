package For;

import java.util.Scanner;

public class PrimosAteN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            boolean isPrimo = true;
            int limite = (int) Math.sqrt(i);

            for (int d = 2; d <= limite; d++) {
                if (i % d == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(i + " é primo");
            }
        }

        sc.close();
    }
}

