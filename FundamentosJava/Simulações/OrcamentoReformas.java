package ExerciciosParaGit;

import java.util.Scanner;

public class OrcamentoReformas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Antes de preencher use como referência os tipos de reforma:\
                
                [ P ] PINTURA\
                
                [ E ] ELÉTRIVA\
                
                [ H ] HIDRAULICA\

                """);

        System.out.print("Tipo de refoma: ");
        char tipoDeReforma = sc.next().charAt(0);
        //Character.toString(tipoDeReforma).toUpperCase();

        System.out.print("Área da reforma: ");
        double areaReforma = sc.nextDouble();

        System.out.print("Orçamento rápido (S/N): ");
        char orcamentoRapido = sc.next().charAt(0);
        System.out.println(" ");

        double precoPintura = areaReforma * 22.50;
        double precoEletrica = areaReforma * 35.00;
        double precoHidraulica = areaReforma * 40.00;

        double precoFinal = 0;

        System.out.println("--------------------------");
        System.out.println("Resumo do orçamento:");

        if (tipoDeReforma == 'P' || tipoDeReforma == 'p') {
            System.out.println("Tipo de reforma: PINTURA");

            if (orcamentoRapido == 'S' || orcamentoRapido == 's') {
                precoPintura += 120;
            }

            precoFinal = precoPintura;

            System.out.printf("Valor total: R$ %.2f%n", precoPintura);
        }
        else if (tipoDeReforma == 'E' || tipoDeReforma == 'e') {
            System.out.println("Tipo de reforma: ELÉTRICA");

            if (orcamentoRapido == 'S' || orcamentoRapido == 's') {
                precoEletrica += 120;
            }

            precoFinal = precoEletrica;

            System.out.printf("Valor total: R$ %.2f%n", precoEletrica);
        }
        else if (tipoDeReforma == 'H' || tipoDeReforma == 'h') {
            System.out.println("Tipo de reforma: HIDRAULICA");

            if (orcamentoRapido == 'S' || orcamentoRapido == 's') {
                precoHidraulica += 120;
            }

            precoFinal = precoHidraulica;

            System.out.printf("Valor total: R$ %.2f%n", precoHidraulica);
        }

        System.out.printf("Área informada: %.2f m²%n%n", areaReforma);

        int valorFinalInt = (int) precoFinal;

        System.out.printf("Valor inteiro: R$%d%n", valorFinalInt);

        System.out.println("Obrigado por utilizar o sistema, espero que tenha obtido o resultado esperado!");

        sc.close();

    }
}
