import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i];
                contPar++;
            } else {
                impares[contImpar] = numeros[i];
                contImpar++;
            }
        }

        System.out.println("\nVetor original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros pares:");
        for (int i = 0; i < contPar; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impares[i] + " ");
        }

        sc.close();
    }
}