// Escreva um programa Java que utilize a função proposta a seguir para decidir se um inteiro
// informado é um número primo ou composto. O programa deve solicitar inicialmente a
// quantidade de inteiros que serão testados. Para cada inteiro, exibir a mensagem “999 eh
// PRIMO” ou “999 eh composto”, conforme o resultado da função

// Teste seu programa pelo menos com os 101 primeiros inteiros positivos

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //int qtde = scanner.nextInt();
        int qtde = 101;

        for(int i = 1; i <= qtde; i++) {
            if(!primo(i)) {
                System.out.println(i + " eh composto");
            }
            else{
                System.out.println(i + " eh PRIMO");
            }
        }
        // scanner.close();
    }


    public static boolean primo(int n) {
        if( n == 1) return false;
        if( n == 2 || n == 3) return true;

        for( int p = 2; p < n; p++ ) {
            if(n % p == 0) return false;
        }
        return true;
    }
}
