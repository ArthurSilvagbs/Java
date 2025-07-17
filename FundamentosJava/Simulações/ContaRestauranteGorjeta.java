package ExerciciosParaGit;

import java.util.Scanner;

public class ContaRestauranteGorjeta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorFinal = 0;

        System.out.print("Valor do consumo: R$ ");
        double valor = sc.nextDouble();

        System.out.print("Deseja incluir 10% da gorjeta (S/N)? ");
        char gorjeta = sc.next().charAt(0);
        double valorGorjeta = valor * 0.10;

        if (gorjeta != 's' && gorjeta != 'S' && gorjeta != 'n' && gorjeta != 'N') {
            System.out.println("Opção inválida. Programa encerrado.");
            return;
        }

        System.out.println("""
                Forma de pagamento:\s
                [ D ] Dinheiro
                [ C ] Cartão""");
        char formaPagamento = sc.next().charAt(0);

        if (formaPagamento != 'C' && formaPagamento != 'c' && formaPagamento != 'D' && formaPagamento != 'd') {
            System.out.println("Opção inválida. Programa encerrado.");
            return;
        }

        if (gorjeta == 'S' || gorjeta == 's') {

            System.out.printf("Valor da gorjeta: R$ %.2f%n", valorGorjeta);

            if (formaPagamento == 'C' || formaPagamento == 'c') {
                valorFinal = valor + valorGorjeta + 3.50;
                System.out.printf("Valor Final com adicionais: R$ %.2f%n", valorFinal);
                System.out.println("Forma de pagamento: Cartão");
            }
            else if (formaPagamento == 'D' || formaPagamento == 'd') {
                valorFinal = valor + valorGorjeta;
                System.out.printf("Valor Final com adicionais: R$ %.2f%n", valorFinal);
                System.out.println("Forma de pagamento: Dinheiro");
            }
        }
        else if (gorjeta == 'N' || gorjeta == 'n') {
            valorFinal = valor;
            if (formaPagamento == 'C' || formaPagamento == 'c') {
                valorFinal = valor + 3.50;
                System.out.printf("Valor Final com adicionais: R$ %.2f%n", valorFinal);
                System.out.println("Forma de pagamento: Cartão");
            }
            else if (formaPagamento == 'D' || formaPagamento == 'd') {
                valorFinal = valor;
                System.out.printf("Valor Final: R$ %.2f%n", valorFinal);
                System.out.println("Forma de pagamento: Dinheiro");
            }
        }

        System.out.println("Valor inteiro final: R$ " + (int) valorFinal);

        System.out.println("----------------------------");
        System.out.println("Obrigado por usar o programa!");

        sc.close();

    }
}
