package While;

import java.util.Scanner;

public class SenhaComTentativasLimitadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senha = "Java2025";
        int tentativas = 0;

        boolean senhaValida;

        while (tentativas != 3) {
            System.out.print("Digite uma senha: ");
            String senha1 = sc.nextLine();

            senhaValida = senha.equals(senha1);

            if (!senhaValida) {
                tentativas++;
                System.out.println("Senha incorreta!");
            }
            else {
                System.out.println("Senha Correta, Bem vindo!");
                break;
            }
        }

        if (tentativas == 3) {
            System.out.println("Acesso bloqueado, tente novamente mais tarde.");
        }

        sc.close();


    }
}
