package MetodosComRetorno;

import java.util.Scanner;

public class SaudacaoPorHorario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();
        System.out.print("Hora: ");
        int hora = sc.nextInt();

        System.out.print(saudacao(nome, hora));

        sc.close();

    }

    public static String saudacao(String nome, int hora) {

        if (hora < 0 || hora > 23) return "Hora inválida";
        if (hora <= 11) return String.format("Bom dia, %s", nome);
        if (hora <= 17) return String.format("Boa tarde, %s", nome);
        return String.format("Boa noite, %s", nome);

    }

}
