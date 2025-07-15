package ExerciciosParaGit;

import java.util.Scanner;

public class AcessoAoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Digite o numero da agência: ");
         int numConta = sc.nextInt();
         System.out.print("Digite a senha: ");
         String senha = sc.next();
         System.out.print("Digite sua idade: ");
         int idade = sc.nextInt();

         boolean acessoTotal = (numConta == 1234) && (senha.equals("java2025") && (idade >= 18));

         if (acessoTotal) {
             System.out.println("Acesso concedido! Bem-vindo ao sistema bancário \uD83C\uDFE6");
         }
         else {
             System.out.println("Acesso negado! Verifique os dados fornecidos ❌");
         }

        sc.close();
    }
}
