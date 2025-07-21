package DoWhile;

import java.util.Scanner;

public class AvaliacaoAlunosBonusControleDeTurma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, notaFinal;

        int totalAlunos = 0, alunosReprovados = 0, alunosAprovados = 0, alunosRecuperacao = 0;

        String opcaoParaContinuar;

        do {
            System.out.print("\nNome do aluno: ");
            sc.nextLine();
            System.out.print("Nota 1 do aluno: ");
            n1 = sc.nextDouble();
            System.out.print("Nota 2 do aluno: ");
            n2 = sc.nextDouble();

            System.out.print("Entregou o trbalho? (S/N): ");
            sc.nextLine();
            String opcao = sc.nextLine();

            double media = (n1 + n2) / 2;

            if (media >= 6.0 && media <= 6.9 && opcao.equalsIgnoreCase("S")) {
                notaFinal = media + 0.5;
                System.out.printf("%nMédia com bonus: %.2f%n", notaFinal);
            }
            else {
                notaFinal = media;
                System.out.printf("Média: %.2f%n", notaFinal);
            }

            if (notaFinal >= 7.0) {
                System.out.println("Situação: Aprovado");
                alunosAprovados ++;
            }
            else if (notaFinal >= 5.0 && notaFinal <= 6.9) {
                System.out.println("Situação: Recuperação");
                alunosRecuperacao ++;
            }
            else {
                System.out.println("Situação: Reprovado");
                alunosReprovados ++;
            }

            totalAlunos ++;

            do {
                System.out.print("\nDeseja avaliar outro aluno? (S/N): ");
                opcaoParaContinuar = sc.nextLine();

                if (!opcaoParaContinuar.equalsIgnoreCase("S") &&
                        !opcaoParaContinuar.equalsIgnoreCase("N")) {
                    System.out.println("Opção inválida. Digite apenas S ou N.");
                }

            } while (!opcaoParaContinuar.equalsIgnoreCase("S") &&
                    !opcaoParaContinuar.equalsIgnoreCase("N"));

            System.out.print("");

        } while (!opcaoParaContinuar.equalsIgnoreCase("N"));

        System.out.println("\nTotal de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + alunosAprovados);
        System.out.println("Recuperação : " + alunosRecuperacao);
        System.out.println("Reprovados: " + alunosReprovados);

        sc.close();

    }
}