package Desafios;

import java.util.Scanner;

public class BilheteriaDeCinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //int[] assentos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] status = new int[10];

        boolean rodando = true;

        while (rodando) {

            int opcaoMenu = mostrarMenu(sc);

            switch (opcaoMenu) {
                case 1:
                    int numeroAssento = escolherNumAssento(sc, status);
                    reservarAssento(sc, status, numeroAssento);

                    int opcaoSelecionarMais = selecionarOutroAssento(sc);

                    while (opcaoSelecionarMais == 1) {
                        System.out.println("Selecione outro assento: ");

                        numeroAssento = escolherNumAssento(sc, status);
                        reservarAssento(sc, status, numeroAssento);

                        opcaoSelecionarMais = selecionarOutroAssento(sc);
                    }

                    opcaoMenu = voltarAoMenu(sc);

                    if (opcaoMenu == 1) {
                        break;
                    }

                    break;

                    //falta criar o loop pra fazer a opcao 2 (nao) funcionar

                //case 2:

                //case 3:

                //case 4:

                case 5:
                    rodando = false;
            }
        }
        sc.close();

    }

    public static int mostrarMenu(Scanner sc) {
        System.out.println("""
                
                ( 1 ) RESERVAR ASSENTO
                ( 2 ) CANCELAR RESERVA
                ( 3 ) MOSTRAR MAPA
                ( 4 ) RELATÓRIO
                ( 5 ) SAIR
                \s
                SELECIONE UMA OPÇAO:\s""");
        return sc.nextInt();
    }

    public static int voltarAoMenu(Scanner sc) {
        System.out.print("""
                
                DESEJA VOLTAR AO MENU?
                
                ( 1 ) SIM
                ( 2 ) NÃO
                
                Selecione uma opção:\s""");
        return sc.nextInt();
    }

    public static int selecionarOutroAssento(Scanner sc) {
        System.out.print("""
                
                DESEJA SELECIONAR OUTRO ASSENTO?
                
                ( 1 ) SIM
                ( 2 ) NÃO
                
                Selecione uma opção:\s""");
        return sc.nextInt();
    }

    public static int escolherNumAssento(Scanner sc, int[] status) {
        System.out.print("\nNumero do assento (1 - 10): ");
        int numeroAssento = sc.nextInt();

        while (numeroAssento > status.length || numeroAssento < 1) {
            System.out.println("Número do assento inválido! Tente novamente");
            System.out.print("\nNumero do assento (1 - 10): ");
            numeroAssento = sc.nextInt();
        }

        return numeroAssento;
    }

    public static void reservarAssento(Scanner sc, int[] status, int numeroAssento) {

        if (status[numeroAssento - 1] == 1) {
            System.out.printf("Assento %d já ocupado.%n", numeroAssento);
            escolherNumAssento(sc, status);
        }
        else {
            status[numeroAssento - 1] = 1;
            System.out.printf("Assento %d reservado com sucesso.%n", numeroAssento);
        }

    }

}