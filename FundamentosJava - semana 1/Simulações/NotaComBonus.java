package ExerciciosParaGit;

import java.util.Scanner;

public class NotaComBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        System.out.print("Digite a nota da prova 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Entregou o trabalho (S/N): ");
        char trabalho = sc.next().charAt(0);
        boolean fezTrabalho = (trabalho == 'S' || trabalho == 's');

        double media = (nota1 + nota2) / 2;

        System.out.printf("%nNome: %s%n", aluno);
        System.out.printf("Nota 1: %.1f%n", nota1);
        System.out.printf("Nota 2: %.1f%n", nota2);
        System.out.printf("Média sem bônus: %.2f%n", media);

        double mediaComBonus = media;
        if (media >= 6.0 && media < 7.0 && fezTrabalho) {
            mediaComBonus += 0.5;
            System.out.printf("Média com bônus: %.2f%n", mediaComBonus);
        }

        if (mediaComBonus < 5.0) {
            System.out.println("Situação: Reprovado");
        }
        else if (mediaComBonus < 7.0) {
            System.out.println("Situação: Recuperação");
        }
        else {
            System.out.println("Situação: Aprovado");
        }

        if (media < 7.0 && mediaComBonus >= 7.0 && fezTrabalho) {
            System.out.println("Você foi aprovado graças ao bônus do trabalho!");
        }

        sc.close();

    }
}
