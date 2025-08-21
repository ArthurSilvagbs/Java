package Wrappers;

import java.util.Scanner;

public class ConversorStringParaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroTexto = sc.nextLine();

        int numero = Integer.parseInt(numeroTexto);

        System.out.println("Número convertido: " + numero);
        System.out.println("Somando 10: " + (numero + 10));

        sc.close();
    }
}
