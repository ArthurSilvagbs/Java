package SwitchCase;

import java.util.Scanner;

public class AgrupandoCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                [ 1 ] SEGUNDA
                [ 2 ] TERÇA
                [ 3 ] QUARTA
                [ 4 ] QUINTA
                [ 5 ] SEXTA
                [ 6 ] SÁBADO
                [ 7 ] DOMINGO
              
                Selecione um dia da semana:\s""");
        int diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1, 2, 3, 4, 5 -> System.out.println("Dia útil");
            case 6, 7           -> System.out.println("Fim de semana");
            default             -> System.out.println("Entrada inválida! Digite de 1 a 7.");
        }

        sc.close();
    }
}
