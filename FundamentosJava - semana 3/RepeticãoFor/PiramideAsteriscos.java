package For;

import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas da pirâmide: ");
        int numLinhas = sc.nextInt();

        for (int linha = 1; linha <= numLinhas; linha++) {
            for (int col = 1; col <= linha; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
