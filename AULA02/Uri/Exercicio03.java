package Uri;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float n1, n2;

        System.out.println("Digite um número: ");
        n1 = in.nextFloat();

        System.out.println("Digite um segundo número");
        n2 = in.nextFloat();

        if (n2 > n1) {
            System.out.printf("%f, %f/n", n2, n1);
        } else {
            System.out.printf("%f, %f/n", n1, n2);
        }

        in.close();

    }

}
