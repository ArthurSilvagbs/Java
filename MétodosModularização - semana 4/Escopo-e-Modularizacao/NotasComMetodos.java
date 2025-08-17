package MetodosVoid;

import java.util.Scanner;

public class NotasComMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        analisarNota(nota);

        sc.close();
    }

    public static void analisarNota(double nota){
        if (nota >= 7){
            System.out.println("Aprovado");
        }
        else if (nota < 7 && nota >= 5){
            System.out.print("Recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
