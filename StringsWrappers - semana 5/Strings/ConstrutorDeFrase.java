package Strings;

public class ConstrutorDeFrase {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hoje ");
        sb.append("é um ótimo dia ");
        sb.append("para aprender ");
        sb.append("Java!");

        StringBuilder sb2 = new StringBuilder();

        sb2.append("Dito isso, ");
        sb2.append("Vasco ");
        sb2.append("da ");
        sb2.append("Gama!!! ");

        System.out.println(sb);
        System.out.println(sb2 );
    }
}
