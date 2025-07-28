package ExerciciosParaGit;

import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMC\n");
        System.out.println("Digite o seu altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = sc.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("IMC: "+imc);

        sc.close();
    }
}
