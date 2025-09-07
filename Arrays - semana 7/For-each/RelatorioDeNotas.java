package ForEach;

public class RelatorioDeNotas {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};

        double soma = 0;
        int quantidadeNotas = 0;
        int i = 1;

        for (double nota : notas) {
            System.out.println("Nota " + i + ": " + nota);
            i ++;
            soma += nota;
            quantidadeNotas ++;
        }

        System.out.println("\nSoma das notas: " + soma);
        System.out.println("\nMédia das notas: " + (soma / quantidadeNotas));

    }
}
