//função primo() apresentada no exercício anterior é correta mas pouco eficiente, já que
//faz mais comparações do que o estritamente necessário. É possível testar a primalidade dos
//101 primeiros inteiros com algo em torno de 130 comparações (total acumulado para os
//inteiros de 1 a 101), mas a função disponibilizada requer exatas 1430 avaliações. Com base
//no que você estudou sobre divisibilidade, modifique a função para que seja mais eficiente e
//consiga determinar o resultado correto com menos comparações.

public class Exercicio3 {
    public static void main(String[] args) {

    }

    public static boolean primo(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;

        if (n % 2 == 0) return false;

        // O laço só vai até a raiz quadrada
        // O 'p++' virou 'p += 2' para testar apenas os ímpares
        for (int p = 3; p <= Math.sqrt(n); p += 2) {
            if (n % p == 0) return false;
        }

        return true;
    }
}
