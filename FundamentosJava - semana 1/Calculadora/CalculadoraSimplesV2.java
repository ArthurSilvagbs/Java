package ExerciciosParaGit;

import java.util.Scanner;

public class CalculadoraSimplesV2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("""
                [ 1 ] SOMA\
                
                [ 2 ] SUBTRAÇÃO\
                
                [ 3 ] MULTIPLICAÇÃO\
                
                [ 4 ] DIVISÃO""");

        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (opcao == 2) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (opcao == 3) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (opcao == 4) {
            double div = (double) num1 / num2;
            System.out.println(num1 + " ÷ " + num2 + " ≈ " + String.format("%.2f", div));
        }
        else {
            System.out.println("Opção invalia, O programa será finalizado!");
        }

       sc.close();
    }
}
