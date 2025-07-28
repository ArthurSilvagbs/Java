package For;

public class ContandoDuasVariaveis {
    public static void main(String[] args) {

        for (int i = 0, j = 100 ; i <= 10 && j >= 90; i++, j--) {
            System.out.printf("i: %d | j: %d%n", i, j);
        }

    }
}
