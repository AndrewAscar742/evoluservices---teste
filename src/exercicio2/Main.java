package exercicio2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um palíndromo (palavra que pode ser lida da esquerda para direita e vice versa)");
        //o uso do next é justamente para evitar palavras compostas
        String text = sc.next();

        //o uso do lowerCase é justamente para evitar Caracteres de caixa alta
        boolean is_palindrome = isPalindrome(text.toLowerCase());

        System.out.println(is_palindrome ? "É palíndromo" : "Não é palíndromo, tente novamente");
    }

    public static boolean isPalindrome(String text){
        //pegamos o tamanho da palavra inserida pelo usuario
        int length = text.length();

        //estou percorrendo a metade da palavra, logo eu dividi a palavra em duas
        for (int i = 0; i < length / 2; i++) {
            //eu comparo as duas metades e caso seja diferente, não é palíndromo
            if (text.charAt(i) != text.charAt(length - i - 1))
                return false;

        }
        return true;
    }
}
