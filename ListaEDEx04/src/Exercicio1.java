//1) Escreva um programa que imprime os inteiros de 1 até 100. Mas para os múltiplos de 3,
//imprima “Fizz” em vez do número e para os múltiplos de 5 imprima “Buzz”. Para números
//que sejam múltiplos tanto de 3 como de 5 imprima “FizzBuzz”.

public class Exercicio1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
