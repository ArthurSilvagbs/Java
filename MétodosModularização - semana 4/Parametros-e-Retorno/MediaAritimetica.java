package MetodosComRetorno;

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        double media = calcularMediaAritimetica(nota1, nota2);

        System.out.printf("Sua média: %.2f%n", media);

        sc.close();
    }

    public static double calcularMediaAritimetica(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }
}
