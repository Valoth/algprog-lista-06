import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nNúmeros informados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        sc.close();
    }
}