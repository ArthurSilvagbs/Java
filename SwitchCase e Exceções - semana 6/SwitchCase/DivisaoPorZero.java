package Execoes;

import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();

        try {
            int resultado =  n1 / n2;
            System.out.printf("%d / %d = %d",n1, n2, resultado);
        }
        catch (ArithmeticException e) {
            System.out.println("Erro: Tentativa de divisão por zero");
        }

        sc.close();

    }
}
