package For;

import java.util.Scanner;

public class ProducaoSemanal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de dias trabalhados: ");
        int diasTrabalhados = sc.nextInt();

        int quantUnidades;
        int somaUnidades = 0;

        int contadorMetasBatidas = 0;

        for (int i = 1; i <= diasTrabalhados; i++) {
            System.out.printf("Itens produzidos dia %d: ", i);
            quantUnidades = sc.nextInt();

            somaUnidades += quantUnidades;

            if (quantUnidades >= 20) {
                contadorMetasBatidas++;
            }
        }

        System.out.printf("%nTotal de unidades produzidas: %d Und%n", somaUnidades);

        double mediaPrducao = (double) somaUnidades / diasTrabalhados;

        System.out.printf("Média de produção diária: %.1f Und/Dia%n", mediaPrducao);
        System.out.printf("Quantidade de dias com metas batidas: %d Dias%n", contadorMetasBatidas);

        sc.close();

    }
}
