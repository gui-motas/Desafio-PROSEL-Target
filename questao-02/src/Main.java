import java.util.Scanner;

//Questão 2:
//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int qntdd = aCounter(frase);

        if (qntdd > 0) {
            System.out.println("A letra 'a' aparece " + qntdd + " vezes na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }

        scanner.close();
    }

    public static int aCounter(String frase) {
        int count = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }
}