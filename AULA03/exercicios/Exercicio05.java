package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int soma = 0, num = 1;

        while (num != 0) {
            num = in.nextInt();
            soma = num + soma;
          
        }
        System.out.println("Soma dos valores digitados: " + soma);
        in.close();
    }
    
}