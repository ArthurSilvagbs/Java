package Introducao;

public class InversorDeOrdem {
    public static void main(String[] args) {
        String[] nomes = {"Arthur", "João", "Maria", "Gabriel", "Clara"};

        int contador = 1;

        for (int i = nomes.length; i != 0 ; i--) {
            System.out.println(nomes[nomes.length - contador]);
            contador ++;
        }

    }
}
