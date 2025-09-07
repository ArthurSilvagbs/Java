package AcessoManipulacao;

public class AlterandoUmValorEspecifico {
    public static void main(String[] args) {
        int[] idades = {18,16, 36, 23, 43};

        for (int i = 0, num = 1; i < idades.length; i++, num++) {
            System.out.println( num + "º idade: " + idades[i]);
        }

        idades[2] = 19;
        System.out.println("\n\nIdades atualizadas: \n");

        for (int i = 0, num = 1; i < idades.length; i++, num++) {
            System.out.println( num + "º idade: " + idades[i]);
        }
    }
}
