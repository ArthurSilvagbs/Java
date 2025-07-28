package For;

import java.util.Scanner;

public class CaixaDeLojaComFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quatidade de clientes que passaram no caixa: ");
        int quantidadeClientes = sc.nextInt();

        double totCompraPorCliente;
        double totVendas = 0;
        String opcao;

        int numClientesCartao = 0;

        for (int i = 1; i <= quantidadeClientes; i++) {
            System.out.printf("Valor da compra do cliente %d: R$ ", i);
            totCompraPorCliente = sc.nextInt();
            sc.nextLine();

            System.out.print("Pagou no cartão? (S/N): ");
            opcao = sc.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                totCompraPorCliente += 3.5;
                numClientesCartao++;
            }

            totVendas += totCompraPorCliente;
        }

        double ValorFinalTaxaCartao = numClientesCartao * 3.5;

        System.out.printf("%nTotal de vendas: R$ %.2f%n", totVendas);
        System.out.printf("Total de clientes que pagaram com cartão: %d%n", numClientesCartao);
        System.out.printf("Total de taxa arrecadada: R$%.2f%n", ValorFinalTaxaCartao);

        sc.close();

    }
}
