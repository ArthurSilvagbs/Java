package Wrappers;

import java.util.Scanner;

public class ConversorNumeroParaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String texto = Integer.toString(numero);

        System.out.println("Número original (int): " + numero);
        System.out.println("Número convertido para texto: " + texto);

        sc.close();
    }
}
