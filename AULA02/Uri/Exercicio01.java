package Uri;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numero;
        float metade;

        System.out.println("Digite um número inteiro: ");
        numero = in.nextInt();

        if (numero > 20){
            //System.out.println("O número digitado é maior que 20, sua metada é: " + numero / 2);
            metade = (float)numero /2;
            System.out.println("Metade = " + metade);
            System.out.printf("Metade = %.2f\n", metade);
        }
            
        in.close();

    }
    
}