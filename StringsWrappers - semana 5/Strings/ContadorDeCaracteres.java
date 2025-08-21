package Strings;

import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String semEspacos = frase.replace(" ", "");

        System.out.printf("Sua frase tem %d caracteres, contando espaços.%n" +
                        "Já sem contar os espaços ela tem %d caracteres.%n",
                frase.length(), semEspacos.length());

        sc.close();
    }
}
