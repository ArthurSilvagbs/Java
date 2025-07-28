package ExerciciosParaGit;

import java.util.Scanner;

public class CaculoDeMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Nota da prova 1: ");
        double nota1 = sc.nextDouble();
        if (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("Nota inválida! O programa será encerrado, inicie ele novamente!");
            sc.close();
            return;
        }
        System.out.print("Nota da prova 2: ");
        double nota2 = sc.nextInt();
        if (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Nota inválida! O programa será encerrado, inicie ele novamente!");
            sc.close();
            return;
        }

        double media = (nota1 + nota2) / 2;

        boolean aprovado = media >= 7.0;
        boolean vaiParaFinal = media < 7.0 && media >= 4.0;

        if (aprovado){
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("%s, você foi APROVADO diretamente! 🎉%n", nome);
        }
        else if (vaiParaFinal) {
            System.out.printf("Média parcial: %.2f%n" +
                    "Situação: Prova final%n", media);

            System.out.println("Digite a nota da prova final: ");
            double notaProvaFinal = sc.nextDouble();

            double notaFinal = (media + notaProvaFinal) / 2;

            System.out.printf("Média final: %.2f%n", notaFinal);
            if (notaFinal >= 5.0){
                System.out.printf("%s, você foi APROVADO na final!", nome);
            }
        }
        else {
            System.out.printf("Média: %.2f%n", media);
            System.out.printf("Sinto muito %s, você foi reprovado!", nome);
        }

        sc.close();

    }
}
