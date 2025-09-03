package SwitchCase;

import java.util.Scanner;

public class MenuDeCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("""
            [ 1 ] SOMAR
            [ 2 ] SUBTRAIR
            [ 3 ] MULTIPLICAR
            [ 4 ] DIVIDIR
           \s
            DIGITE A OPÇÃO DESEJADA:\s""");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                int soma = n1 + n2;
                System.out.println("Soma = " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                System.out.println("Subtração = " + subtracao);
                break;
            case 3:
                int multiplicacao = n1 * n2;
                System.out.println("Multiplicação = " + multiplicacao);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    double divisao = (double) n1 / n2;
                    System.out.println("Divisão = " + divisao);
                }
                break;
            default:
                System.out.print("Opção inválida!");
                break;
        }

        sc.close();
    }
}
