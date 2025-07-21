package While;

import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senhaCadastrada = "java123";
        String senhaDigitada;

        System.out.println("Digite a senha: ");
        senhaDigitada = sc.nextLine();

        while (!senhaCadastrada.equals(senhaDigitada)) {
            System.out.println("Senha incorreta!");
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();
        }

        System.out.println("Senha correta!");
        System.out.println("Acesso liberado com sucesso!");

        sc.close();

    }
}
