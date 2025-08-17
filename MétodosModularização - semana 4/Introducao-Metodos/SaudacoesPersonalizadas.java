package MetodosVoid;

import java.util.Scanner;

public class SaudacoesPersonalizadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        saudarUsuario(nome, idade);

        sc.close();

    }

    public static void saudarUsuario(String nome, int idade){
        System.out.printf("Olá, %s! Você tem %d anos. Seja bem-vindo(a)!%n", nome, idade);
    }
}
