import java.util.Scanner;

//Questão 1:
// 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.


public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();


        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();

    }

    public static boolean isFibonacci(int numero) {
        if (numero < 0) return false;
        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return b == numero || a == numero;
    }

}