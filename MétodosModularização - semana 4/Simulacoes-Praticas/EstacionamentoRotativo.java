package ExerciciosFinais;

import java.util.Scanner;

public class EstacionamentoRotativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String placa = receberPlaca(sc);
        int opcao = receberOpcaoMenu(sc);
        int minutosEstacionados = receberMinutosEstacionados(sc);
        int minutosCobrados = calcularMinutosCobrados(minutosEstacionados);
        int blocos = calcularBlocos(minutosCobrados);
        double precoCobrado = calcularSubtotal(blocos, opcao);
        double precoPorBloco = precoPorBloco(opcao);
        String periodo = verificarPeriodo(opcao);
        double subtotal = calcularSubtotal(blocos, opcao);
        double total = calcularTotal(precoCobrado);
        System.out.print(relatorio(placa, periodo, minutosEstacionados, minutosCobrados, blocos, precoPorBloco, subtotal, total));

        sc.close();
    }

    public static String receberPlaca(Scanner sc) {
        System.out.print("Placa do veículo: ");
        String placa = sc.nextLine().toUpperCase().trim();
        int contagemCaracteres = placa.length();
        while (contagemCaracteres < 7 ) {
            System.out.println("Entrada inválida! Digite a placa novamente.");
            System.out.print("Placa do veículo: ");
            placa = sc.nextLine().toUpperCase().trim();
            contagemCaracteres = placa.length();
        }
        return placa;
    }

    public static int receberOpcaoMenu(Scanner sc){
        System.out.print("""
                
                PERÍODO
                [ 1 ] Dia útil
                [ 2 ] Noite
                [ 3 ] Fim de semana
                Digite a opção desejada:\s""");
        int opcao = sc.nextInt();
        while (opcao < 1 || opcao > 3) {
            System.out.println("\nOpção inválida! Digite 1, 2 ou 3.");
            System.out.print("""
                
                PERÍODO
                [ 1 ] Dia útil
                [ 2 ] Noite
                [ 3 ] Fim de semana
                Digite a opção desejada:\s""");
            opcao = sc.nextInt();
        }
        return opcao;
    }

    public static int receberMinutosEstacionados(Scanner sc){
        System.out.print("\nMinutos estacionados: ");
        int minutos = sc.nextInt();
        while (minutos < 0) {
            System.out.print("Valor inválido! Digite 0 ou mais\n");
            System.out.print("\nMinutos estacionados: ");
            minutos = sc.nextInt();
        }

        return minutos;
    }

    static final int franquia = 15;

    public static int calcularMinutosCobrados(int minutosEstacionados){
        return minutosEstacionados - franquia;
    }
    
    public static int calcularBlocos(int minutosEstacionados){
        int blocos = minutosEstacionados / 15;
        
        if (minutosEstacionados % 2 != 0) {
            blocos = (minutosEstacionados / 15) + 1;
        }
        
        return blocos;
    }

    public static double calcularSubtotal(int bloco, int opcao) {

        return switch (opcao) {
            case 1 -> bloco * 2.0;
            case 2 -> bloco * 1.5;
            case 3 -> bloco * 1.0;
            default -> 0;
        };

    }

    public static double precoPorBloco(int opcao) {

        return switch (opcao) {
            case 1 -> 2.0;
            case 2 -> 1.5;
            case 3 -> 1.0;
            default -> 0;
        };

    }

    public static double calcularTotal(double subTotal) {
        return subTotal;
    }

    public static String verificarPeriodo(int opcao){
        String periodo = " ";

        if (opcao == 1) {
            periodo = "Dia útil";
        }
        else if (opcao == 2) {
            periodo = "Noite";
        }
        else if (opcao == 3) {
            periodo = "Fim de semana";
        }

        return periodo;
    }

    public static String relatorio(String placa, String periodo, int minutos, int minutosCobrados, int blocos, double precoPorBloco, double subtotal, double total) {
        return String.format("Tíquete - Estacionamento Rotativo%n" +
                "------------------------------------------%n" +
                "Placa: %s%n" +
                "Período: %s%n" +
                "Minutos: %d%n" +
                "Franquia: %d min%n" +
                "Minutos cobrados: %d min%n" +
                "Blocos de 15 min: %d%n" +
                "Preço por bloco: R$ %.2f%n" +
                "Subtotal: R$ %.2f%n" +
                "Multa: nao consegui fazer ainda%n" +
                "Total a pagar: R$ %.2f", placa, periodo, minutos, franquia, minutosCobrados, blocos, precoPorBloco, subtotal, total);
    }

}
