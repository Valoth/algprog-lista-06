import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] medias = new double[10];
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;

            System.out.println("\nAluno " + (i + 1));
            for (int x = 0; x < 4; x++) {
                System.out.print("Digite a " + (x + 1) + "ª nota: ");
                soma += sc.nextDouble();
            }

            double media = soma / 4;
            medias[i] = media;

            if (media >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("\nQuantidade de alunos com média >= 7.0: "
                + aprovados);

        sc.close();
    }
}