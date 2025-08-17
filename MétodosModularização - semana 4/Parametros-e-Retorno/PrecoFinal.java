package MetodosComRetorno;

import java.util.Scanner;

public class PrecoFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nomeProduto = sc.nextLine().toUpperCase();

        System.out.printf("%nProduto: %s%n" +
                "Você confirma que o nome esta correto (S/N)? ", nomeProduto);
        String opcao = sc.nextLine().toUpperCase();
        boolean seguir = opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("SIM");
        while (!seguir) {
            System.out.print("\nNome do produto: ");
            nomeProduto = sc.nextLine().toUpperCase();
            System.out.printf("%nProduto: %s%n" +
                    "Você confirma que o nome esta correto (S/N)? ", nomeProduto);
            opcao = sc.nextLine().toUpperCase();
            seguir = opcao.equalsIgnoreCase("S")  || opcao.equalsIgnoreCase("SIM");
        }

        System.out.print("\nPreço do produto: ");
        double preco = sc.nextDouble();
        while (preco <= 0) {
            System.out.println("Preço inválido inserido! Tente novamente!");
            System.out.print("\nPreço do produto: ");
            preco = sc.nextDouble();
        }

        System.out.print("\nPercentual do desconto (%): ");
        double desconto = sc.nextDouble();
        while (desconto < 0 || desconto > 100) {
            System.out.println("Desconto inválido inserido! Tente novamente!");
            desconto = sc.nextDouble();
        }

        System.out.print("\nPercentual do imposto (%): ");
        double imposto = sc.nextDouble();
        while (imposto < 0 || imposto > 100) {
            System.out.println("Imposto inválido inserido! Tente novamente!");
            imposto = sc.nextDouble();
        }

        double valorComDesconto = preco - aplicarDesconto(preco, desconto);
        double valorImposto = aplicarImposto(valorComDesconto, imposto) + valorComDesconto;
        double valorFinal = precoFinal(preco, valorComDesconto, valorImposto) - valorComDesconto;

        System.out.printf("Nome do produto: %s%n", nomeProduto);
        System.out.println("Valor do Desconto: " + aplicarDesconto(preco, desconto));
        System.out.println("Valor do Imposto: " + aplicarImposto(valorComDesconto, imposto));
        System.out.println("Valor Final: " + valorFinal);

        sc.close();

    }

    public static double aplicarDesconto(double preco, double desconto) {
        preco = preco * desconto / 100;
        return preco;
    }

    public static double aplicarImposto(double precoComDesconto, double imposto) {
        precoComDesconto = precoComDesconto * imposto / 100;
        return precoComDesconto;
    }

    public static double precoFinal(double preco, double valorDesconto, double valorImposto) {
        preco =  valorDesconto + valorImposto;
        return preco;
    }
}
