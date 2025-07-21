package DoWhile;

import java.util.Scanner;

public class CaixaDeSuperMercado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcao;
        String nome;
        int contador = 0;
        double soma = 0;
        double valorProduto;

        do {
            System.out.print("Nome do produto: ");
            nome = sc.nextLine();
            System.out.print("Valor do produto: ");
            valorProduto = sc.nextDouble();

            soma += valorProduto;
            contador ++;

            System.out.println("Deseja continuar? [S/N]: ");
            sc.nextLine();
            opcao = sc.nextLine();

        } while (opcao.equalsIgnoreCase("S"));

        int somaInt = (int) soma;

        System.out.printf("Total da compra: R$%.2f%n", soma);
        System.out.printf("Total da compra (inteiro): R$%d%n", somaInt);
        System.out.printf("Quantidade de itens: %d%n", contador);

        System.out.println("------------------------------");
        System.out.println("Compra finalizada com sucesso!");

        System.out.println("------------------------------");
        System.out.println("Obrigado por usar o sistema!");


        sc.close();

    }
}
