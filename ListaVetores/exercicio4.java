import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letras = new char[10];

        for (int i = 0; i < letras.length; i++) {
            System.out.print("Informe a " + (i + 1) + "ª letra: ");
            letras[i] = sc.next().charAt(0);
        }

        System.out.println("\nConsoantes informadas:");

        for (int i = 0; i < letras.length; i++) {
            char letra = Character.toLowerCase(letras[i]);

            if (letra != 'a' &&
                letra != 'e' &&
                letra != 'i' &&
                letra != 'o' &&
                letra != 'u') {

                System.out.println(letras[i]);
            }
        }

        sc.close();
    }
}