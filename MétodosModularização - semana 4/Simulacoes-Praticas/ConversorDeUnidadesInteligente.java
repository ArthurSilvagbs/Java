import java.util.Scanner;

public class ConversorDeUnidadesInteligente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = lerOpcao(sc);
        double valor = lerValor(sc);

        // Conversão com sobrecarga
        double resultado = 0;
        String relatorio = "";

        if (opcao == 1) {
            resultado = converter(valor); // km → mi
            relatorio = relatorioFinal(opcao, valor, resultado);
        } else if (opcao == 2) {
            resultado = converter(valor, true); // °C → °F
            relatorio = relatorioFinal(opcao, valor, resultado);
        } else if (opcao == 3) {
            resultado = converter(valor, 0); // kg → lb
            relatorio = relatorioFinal(opcao, valor, resultado);
        }

        System.out.println("\n" + relatorio);

        sc.close();
    }

    public static int lerOpcao(Scanner sc) {
        System.out.print("Conversão (1=km→mi, 2=°C→°F, 3=kg→lb): ");
        int opcao = sc.nextInt();
        sc.nextLine();

        while (opcao < 1 || opcao > 3) {
            System.out.print("Opção inválida! Digite 1, 2 ou 3.\n" +
                    "Conversão (1=km→mi, 2=°C→°F, 3=kg→lb): ");
            opcao = sc.nextInt();
            sc.nextLine();
        }
        return opcao;
    }

    public static double lerValor(Scanner sc) {
        System.out.print("\nValor a converter: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        while (valor < 0) {
            System.out.print("Valor inválido! Digite 0 ou mais.\n" +
                    "Valor a converter: ");
            valor = sc.nextDouble();
            sc.nextLine();
        }
        return valor;
    }

    // ----------- MÉTODOS SOBRECARGA -----------------

    public static double converter(double km) {
        return km * 0.621371; // km → mi
    }

    public static double converter(double celsius, boolean paraFahrenheit) {
        return (celsius * 9 / 5) + 32; // °C → °F
    }

    public static double converter(double kg, int dummy) {
        return kg * 2.20462; // kg → lb
    }

    // ----------- RELATÓRIO -----------------

    public static String relatorioFinal(int opcao, double valor, double resultado) {
        String entradaRotulo = "";
        String resultadoRotulo = "";
        String conversao = "";

        if (opcao == 1) {
            conversao = "km → mi";
            entradaRotulo = "km";
            resultadoRotulo = "mi";
        } else if (opcao == 2) {
            conversao = "°C → °F";
            entradaRotulo = "°C";
            resultadoRotulo = "°F";
        } else if (opcao == 3) {
            conversao = "kg → lb";
            entradaRotulo = "kg";
            resultadoRotulo = "lb";
        }

        return String.format("Conversão selecionada: %s%nEntrada: %.2f %s%nResultado: %.2f %s",
                conversao, valor, entradaRotulo, resultado, resultadoRotulo);
    }
}
