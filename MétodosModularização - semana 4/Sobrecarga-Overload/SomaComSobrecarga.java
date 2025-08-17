package MetodosComRetorno;

public class teste {
    public static void main(String[] args) {
        int n1 = 1, n2 = 2;
        double n3 = 3, n4 = 4;

        //código

        Somar(n1, n2);
        Somar(n3, n4);
    }

    public static double Somar(double a, double b){
        return a + b;
    }

    public static double Somar(int a, int b){
        return a + b;
    }
}
