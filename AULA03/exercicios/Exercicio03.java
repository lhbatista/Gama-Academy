package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;
        int cont;

        System.out.println("Digite um número: ");
        numero = in.nextInt();

        cont = 1;

        while (cont <= numero) {
            //System.out.printf(", %d", cont);
            System.out.print("," + cont);
            cont = cont * 2;
        }

        in.close();
    }

}