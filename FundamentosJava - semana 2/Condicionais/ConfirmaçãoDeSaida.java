package DoWhile;

import java.util.Scanner;

public class ConfirmaçãoDeSaida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Deseja realmente sair? (S/N): ");
            opcao = sc.nextLine();

        } while (!opcao.equalsIgnoreCase("s"));

        System.out.println("Saindo do sistema...");

        sc.close();

    }
}
