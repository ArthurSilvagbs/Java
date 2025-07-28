package ExerciciosParaGit;

import java.util.Scanner;

public class DiasVividosV1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos");
        int idade = sc.nextInt();

        int quantDias = idade * 365;

        System.out.println("Você viveu aproximadamente " + quantDias + " dias");

        sc.close();
    }
}
