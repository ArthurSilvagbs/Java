package ExerciciosFinais;

import java.util.Scanner;

public class OrcamentoDeEventoComunitario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade = lerQuantidadeItens(sc);

        double somaTotal = 0;
        double soma = lerESomarItem(sc, quantidade, somaTotal);

        String relatorio = relatorioFinal(soma, receberImposto(sc));

        System.out.println("\n" + relatorio);

        sc.close();
    }

    public static int lerQuantidadeItens(Scanner sc) {
        System.out.print("Digite a quantidade de itens: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); //tirando o bug no sc.nextline seguido de um sc.nexrInt

        while (quantidade <= 0) {
            System.out.print("Valor invalido! Digite um valor maior que 0. \n" +
                    "Quantidade de categorias: ");
            quantidade = sc.nextInt();
            sc.nextLine(); //tirando o bug no sc.nextline seguido de um sc.nexrInt
        }

        return quantidade;
    }

    public static double lerESomarItem(Scanner sc, int quantidade, double soma) {
        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("%nItem %d - Nome: ", i);
            String nome = sc.nextLine();

            System.out.printf("Item %d - Preço (R$): ", i);
            double preco = sc.nextDouble();
            while (preco <= 0) {
                System.out.printf("Valor Inválido! Digite um valor maior que 0.\n" +
                        "Item %d - Preço (R$): ", i);
                preco = sc.nextDouble();
            }

            sc.nextLine(); //tirando o bug no sc.nextline seguido de um sc.nexrInt

            soma = somar(soma, preco);
        }
        return soma;
    }

    public static double somar(double soma, double preco){
        return soma + preco;
    }

    public static int receberImposto(Scanner sc) {
        System.out.println(" ");
        System.out.print("Percentual do imposto (%): ");
        int imposto = sc.nextInt();

        while (imposto < 0 || imposto > 100) {
            System.out.println("Imposto inválido! Digite de 0 a 100.");
            System.out.print("Percentual do imposto (%): ");
            imposto = sc.nextInt();
        }

        return imposto;
    }

    public static double aplicarDesconto(double soma, int percentualDesconto) {
        return soma * percentualDesconto / 100;
    }

    public static double precoComImposto(double soma, double percentualImposto) {
        return soma * ((percentualImposto / 100) + 1);
    }

    public static String relatorioFinal(double somaFinal, int imposto){

        int desconto = 0;

        if (somaFinal >= 1000.0 && somaFinal < 5000.0) desconto = 5;
        else if (somaFinal >= 5000.0 && somaFinal < 10000.0) desconto = 8;
        else if (somaFinal >= 10000.0) desconto = 10;

        // valor do desconto em reais
        double valorDoDesconto = aplicarDesconto(somaFinal, desconto);

        // preço já com desconto aplicado
        double precoComDesconto = somaFinal - valorDoDesconto;

        // preço já com imposto aplicado
        double precoComImposto = precoComImposto(precoComDesconto, imposto);

        // valor do imposto em reais
        double valorDoImposto = precoComImposto - precoComDesconto;

        return String.format("Resumo do Orçamento%n" +
                        "-------------------------------%n" +
                        "Total bruto: R$ %.2f%n" +
                        "Faixa de desconto: %d%% %n" +
                        "Valor do desconto: R$ %.2f%n" +
                        "Base do imposto (após desconto): R$ %.2f%n" +
                        "Imposto (%d%%): R$ %.2f%n" +
                        "Total Final: R$ %.2f%n",
                somaFinal, desconto, valorDoDesconto, precoComDesconto,
                imposto, valorDoImposto, precoComImposto);
    }

}