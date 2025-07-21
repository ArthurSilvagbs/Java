package While;

import java.util.Scanner;

public class CalculadoraInterativa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    [ 1 ] Somar dois números
                    [ 2 ] Subtrair dois números
                    [ Sair ] Encerrar o programa""");

            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.print("Digite o primeiro valor: ");
                int a = sc.nextInt();
                System.out.print("Digite o segundo valor: ");
                int b = sc.nextInt();
                sc.nextLine(); // consumir o \n pendente
                System.out.println("Resultado: " + (a + b));
            }
            else if (opcao.equals("2")) {
                System.out.print("Digite o primeiro valor: ");
                int a = sc.nextInt();
                System.out.print("Digite o segundo valor: ");
                int b = sc.nextInt();
                sc.nextLine(); // consumir o \n pendente
                System.out.println("Resultado: " + (a - b));
            }
            else if (opcao.equalsIgnoreCase("sair") || opcao.equals("3")) {
                System.out.println("Encerrando o programa...");
                break;
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("O programa se encerrará agora!");
        sc.close();
    }
}
