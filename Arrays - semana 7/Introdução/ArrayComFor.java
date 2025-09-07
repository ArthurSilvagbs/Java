package Introducao;

public class ArrayComFor {
    public static void main(String[] args) {
        int[] numero = {4, 44, 444, 4444, 44444};

        for (int i = 0, num = 1; i < numero.length; i++, num++) {
            System.out.println( num + "º número: " + numero[i]);
        }
    }
}