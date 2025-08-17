package MetodosVoid;

import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        diasVividos(idade);

        sc.close();

    }

    public static void diasVividos(int anos){
        int dias = anos * 365;
        System.out.printf("Você já viveu aproximadamente %d dias!%n", dias);
    }
}
