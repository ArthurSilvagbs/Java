package Execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroPositivoComValidacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            try {
                System.out.print("Digite um número positivo: ");
                numero = sc.nextInt();

                if (numero < 0) {
                    System.out.println("Erro: número precisa ser positivo!");
                } else {
                    System.out.println("Número válido: " + numero);
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: você não digitou um número inteiro!");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
