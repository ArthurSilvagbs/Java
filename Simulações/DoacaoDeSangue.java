package ExerciciosParaGit;

import java.util.Scanner;

public class DoacaoDeSangue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite o caractere referente ao seu sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        if (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f') {
            System.out.println("Caractere inválido, o programa será encerrado.");
            return;
        }

        boolean aptoM = (idade >= 16 && idade <= 69) && (peso > 50.0);
        boolean aptoF = (idade >= 16 && idade <= 60) && (peso > 50.0);

        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Peso: %.2f%n", peso);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sexo: Masculino");

            if (aptoM) {
                System.out.printf("%s, você está apto para doar sangue\n", nome);
            } else {
                System.out.printf("%s, você não está apto para doar sangue\n", nome);
            }
        }
        else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Sexo: Feminino");

            if (aptoF) {
                System.out.printf("%s, você está apta para doar sangue\n", nome);
            }
            else if (idade > 60) {
                System.out.println("Motivo: Mulheres acima de 60 anos não podem doar.");
            } else if (peso <= 50.0) {
                System.out.println("Motivo: Peso insuficiente.");
            } else {
                System.out.println("Motivo: Idade fora da faixa permitida.");
            }

        }

        sc.close();

    }
}
