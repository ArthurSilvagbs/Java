package Introducao;

public class MediaComArray {
    public static void main(String[] args) {
        double[] nota = {7.5, 8.0, 6.5, 9.0};

        double soma = 0; int dividendo = 0;

        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
            System.out.println("Nota " + (i + 1) + ":" + nota[i]);
            dividendo ++;
        }

        System.out.println("Nota final: " + (soma/dividendo));
    }
}
