package Introducao;

public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = {21, 54, 12, 3, 5, 37};

        int maior = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
    }
}
