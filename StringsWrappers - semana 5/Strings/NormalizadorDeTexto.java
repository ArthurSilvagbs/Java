package Strings;

import java.util.Scanner;

public class NormalizadorDeTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println("Maiúsculas: " + palavra.toUpperCase());
        System.out.println("Minúsculas: " + palavra.toLowerCase());
        System.out.println("Primeira letra: " + palavra.charAt(0));

        sc.close();
    }
}
