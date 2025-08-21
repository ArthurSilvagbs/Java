package Wrappers;

import java.util.Scanner;

public class BooleanChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite true ou false: ");
        String entrada = sc.nextLine();

        boolean valor = Boolean.parseBoolean(entrada);

        System.out.println("Valor digitado: " + valor);
        System.out.println("Valor invertido: " + !valor);

        sc.close();
    }
}
