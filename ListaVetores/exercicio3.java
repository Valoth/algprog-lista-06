import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaNotas = 0.0;

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + "º nota: ");
            notas[i] = sc.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;
        System.out.printf("\nA média das notas é: %.2f", media);

        sc.close();
    }
}
