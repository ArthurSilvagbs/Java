package DoWhile;

import java.util.Scanner;

public class MenuDataMensagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mensagem = "“Não é o mais forte que sobrevive, mas o que melhor se adapta às mudanças.” – Darwin";
        String data = "18/07/2025";
        String opcao;

        do {
            System.out.println("""
                    [ 1 ] Mensagem
                    [ 2 ] Data
                    [ 3 ] Sair""");
            System.out.print("Opção: ");
            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("\nMensagem: " + mensagem + "\n");
            }
            else if (opcao.equals("2")) {
                System.out.println("\nData atual do sistema: " + data + "\n");
            }
            else {
                System.out.println("Opção inválida. Tente novamente.\n");
            }
            
        } while (!opcao.equalsIgnoreCase("3") && !opcao.equalsIgnoreCase("sair"));

        System.out.println("-------------------------------");
        System.out.println("Encerrando o programa...");

        sc.close();

    }
}

