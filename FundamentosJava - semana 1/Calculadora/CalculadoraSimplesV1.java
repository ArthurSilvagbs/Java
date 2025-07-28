package ExerciciosParaGit;

import java.util.Scanner;

public class CalculadoraSimplesV1 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;

        System.out.println(
                "[ SOMA ] " + num1 + " + " + num2 + " = " + soma +
                "\n[ SUBTRAÇÃO ] " + num1 + " - " + num2 + " = " + subtracao +
                "\n[ MULTIPLICAÇÃO ] " + num1 + " x " + num2 + " = " + multiplicacao +
                "\n[ DIVISÃO ] " + num1 + " ÷ " + num2 + " ≈ " + String.format("%.2f", divisao));

       sc.close();
    }
}
