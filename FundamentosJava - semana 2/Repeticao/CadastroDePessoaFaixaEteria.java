package DoWhile;

import java.util.Scanner;

public class CadastroDePessoaFaixaEteria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadastro;
        int idade;
        int somaIdades = 0;
        int contadorMenorIdade = 0;
        int contador60mais = 0;
        int contador = 0;

        do {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();

            if (idade < 18) {
                contadorMenorIdade++;
            }
            else if (idade > 60) {
                contador60mais++;
            }

            somaIdades += idade;
            contador++;

            System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
            sc.nextLine();
            cadastro = sc.nextLine();

        } while (!cadastro.equalsIgnoreCase("N"));

        double mediaIdades = (double) somaIdades / contador;

        System.out.println("\n--------------------------------------------------------");
        System.out.printf("Total de pessoas: %d%n", contador);
        System.out.printf("Quantidade de pessoas menores de idade: %d%n", contadorMenorIdade);
        System.out.printf("Quantidade de pessoas com mais de 60 anos: %d%n", contador60mais);
        System.out.printf("Média das idades: %.2f%n", mediaIdades);
        System.out.println("Média (valor inteiro): " + (int) mediaIdades);
        System.out.println("--------------------------------------------------------\n");

        sc.close();

    }
}
