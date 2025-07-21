package DoWhile;

import java.util.Scanner;

public class CalculoDeNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcao;
        double nota;
        int contador = 0;
        double somaNota = 0;

        do {
            System.out.print("Digite a nota: ");
            nota = sc.nextDouble();
            contador++;
            somaNota += nota;

            System.out.print("Deseja continuar? (S/N): \n");
            sc.nextLine();
            opcao = sc.nextLine();

        } while (opcao.equalsIgnoreCase("s"));

        double media = somaNota/contador;
        int mediaInt = (int) media;

        System.out.printf("Média Final: %.2f%n", media);
        System.out.printf("Média Final inteira: %d%n%n", mediaInt);

        System.out.println("------------------------------");
        System.out.println("Obrigado por usar o sistema!");

        sc.close();

    }
}
