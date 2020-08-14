package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor, resultado;
        int mult = 0;

        System.out.println("Digite um valor a ser calculado");
        valor = in.nextInt();

        while (mult <= 10) {
            resultado = valor * mult;
            System.out.println(resultado);
            mult++;
        }
        in.close();
    }
}