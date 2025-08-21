package Wrappers;

import java.util.Scanner;

public class CalculadoraDePreco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço (use ponto para decimais): ");
        String precoTexto = sc.nextLine();

        double preco = Double.parseDouble(precoTexto);

        double precoComDesconto = preco - (preco * 0.05);

        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Preço com 5%% de desconto: R$ %.2f%n", precoComDesconto);

        sc.close();
    }
}
