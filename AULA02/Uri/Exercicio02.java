package Uri;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float n1, n2, media;

        System.out.println("Digite a sua N1: ");
        n1 = in.nextFloat();

        System.out.println("Digite a sua N2: ");
        n2 = in.nextFloat();

       media = (n1*0.4f) + (n2*0.6f);

       if (media >= 6.0) {

        System.out.println("O aluno foi aprovado");

    
       }
   
       in.close();

    }
    
}