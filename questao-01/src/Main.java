import java.util.Scanner;

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