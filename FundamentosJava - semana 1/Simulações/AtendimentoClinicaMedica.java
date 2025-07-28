package ProjetoDeEncerramento;

import java.util.Scanner;

public class AtendimentoClinicaMedica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DO PACIENTE");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        if (idade < 0 || idade > 120) {
            System.out.println("Idade invalida! O programa será encerrado agora.");
            return;
        }

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.println(" ");

        double imc = peso/(altura*altura);
        int imcInteiro = (int) imc;

        boolean risco = idade >= 65 || imc >= 35.0;

        String classificacao;

        System.out.printf("Nome do paciente: %s%n" +
                "Idade: %d%n" +
                "Sexo (M/F): %c%n" +
                "Peso (kg): %.1f%n" +
                "Altura (m): %.2f%n", nome, idade, sexo, peso, altura);

        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        }
        else if (imc > 18.5 && imc <= 24.9) {
            classificacao = "Peso ideal";
        }
        else if (imc > 25 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        }
        else if (imc > 30 && imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        }
        else if (imc > 35 && imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        }
        else if (imc >= 40) {
            classificacao = "Obesidade Grau III";
        }
        else {
            System.out.println("Ocorreu um erro inesperado, reinicie o programa!");
            return;
        }

        System.out.printf("%nIMC: %.2f%n", imc);
        System.out.printf("Classificação: %s%n", classificacao);
        System.out.printf("IMC inteiro: %d%n%n", imcInteiro);

        if (risco) {
            System.out.println("Paciente com prioridade para avaliação médica. Risco identificado!\n");
        }

        sc.close();
    }
}
