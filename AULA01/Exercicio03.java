package AULA01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        float salarioBase;
        float reajuste;

        System.out.println("Qual é o seu sálario atual?: ");
        salarioBase= entrada.nextFloat();

        reajuste = salarioBase * 0.25f;

        System.out.println("Seu salário após o aumento de 25% é de: " + (reajuste + salarioBase));  

        entrada.close();

    }
    
}