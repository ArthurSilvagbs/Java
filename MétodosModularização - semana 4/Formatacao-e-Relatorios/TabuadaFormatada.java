package MetodosVoid;

import java.util.Scanner;

public class TabuadaFormatada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println(" ");

        exibirTabuada(numero);

        sc.close();
    }

    public static void exibirTabuada(int numero){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}
