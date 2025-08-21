package Strings;

import java.util.Scanner;

public class ExtratorDeSobrenome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine().trim();

        int indice = nomeCompleto.lastIndexOf(" ");

        String ultimonome = nomeCompleto.substring(indice);

        System.out.print("Seu sobrenome é: " + ultimonome.trim());

        sc.close();
    }
}
