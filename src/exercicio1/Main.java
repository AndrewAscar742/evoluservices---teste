package exercicio1;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("TicoTeco");
            else if (i % 5 == 0)
                System.out.println("Teco");
            else if (i % 3 == 0)
                System.out.println("Tico");
            else
                System.out.println(i);
        }
    }
}
