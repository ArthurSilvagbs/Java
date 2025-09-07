package AcessoManipulacao;

public class ZerandoValores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};

        System.out.println("Array original: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        for (int i = 0; i < numeros.length; i ++) {
            numeros[i] = 0;
        }

        System.out.println("Array 'zerado': ");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
