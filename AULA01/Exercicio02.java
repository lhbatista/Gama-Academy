package AULA01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        Float nota1;
        Float nota2;

        System.out.println("Digite sua N1: ");
        nota1= entrada.nextFloat();
         
        System.out.println("Digite sua N2: ");
        nota2= entrada.nextFloat();

        System.out.println("Sua média é " + ((nota1 + nota2) / 2));

        entrada.close();

    }
    
}