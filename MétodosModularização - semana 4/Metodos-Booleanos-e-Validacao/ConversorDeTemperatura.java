package MetodosVoid;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um temperatura em Celsius: ");
        double temperatura = sc.nextDouble();

        converterParaFahrenheit(temperatura);

        sc.close();

    }

    public static void converterParaFahrenheit(double temperatura) {
        double fahrenheit = (temperatura * (9.0/5.0) + 32);

        System.out.printf("A temperatura em Fahrenheit é: %.1f ºF%n", fahrenheit);
    }

}
