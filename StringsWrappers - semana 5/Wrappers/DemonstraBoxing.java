package Wrappers;

public class DemonstraBoxing {
    public static void main(String[] args) {
        Integer numeroCaixa = 50; // Autoboxing (int -> Integer)
        int numeroPrimitivo = 20;

        int soma = numeroCaixa + numeroPrimitivo; // Unboxing + cálculo
        Integer resultado = soma; // Autoboxing novamente

        System.out.println("Integer (numeroCaixa): " + numeroCaixa);
        System.out.println("int (numeroPrimitivo): " + numeroPrimitivo);
        System.out.println("Resultado da soma: " + resultado);
    }
}
