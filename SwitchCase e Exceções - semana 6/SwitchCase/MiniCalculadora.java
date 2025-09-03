package Execoes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MiniCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int b = sc.nextInt();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = sc.nextInt();

            int resultado;

            switch (opcao) {
                case 1 -> resultado = a + b;
                case 2 -> resultado = a - b;
                case 3 -> resultado = a * b;
                case 4 -> resultado = a / b;
                default -> {
                    System.out.println("Opção inválida.");
                    return;
                }
            }

            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: você não digitou um número inteiro.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e);
        }

        sc.close();
    }
}
