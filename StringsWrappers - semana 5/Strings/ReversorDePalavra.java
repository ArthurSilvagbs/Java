package Strings;

import java.util.Scanner;

public class ReversorDePalavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        StringBuilder sb = new StringBuilder(palavra);

        System.out.println("Palavra invertida: " + sb.reverse());

        sc.close();
    }
}
