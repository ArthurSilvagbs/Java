package For;

public class ContagemESoma {
    public static void main(String[] args) {

        int soma= 0;
        int i = 100; // Declaração da variavel antes

        for (i = 1;i <= 50; i++){
            System.out.print(i + " ");
            soma += i;
        }

        System.out.println("\n\nSoma dos números de 1 a 50 = " + soma);

    }
}
