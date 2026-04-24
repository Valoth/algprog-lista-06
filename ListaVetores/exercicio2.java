import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
         System.out.println("Informe o " + (i + 1) + "º número: ");
          numeros[i] = sc.nextDouble();
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("O " + (i + 1) + "º número informado foi: " + numeros[i]);
        }

        sc.close();
    }
}