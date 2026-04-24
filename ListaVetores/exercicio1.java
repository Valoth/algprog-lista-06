import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros informados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}