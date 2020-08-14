package Uri;

import java.util.Scanner;

public class Execicio04 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o valor do lado A: ");
        a = in.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b = in.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c = in.nextInt();

        if((a+b>c) && (a+c>b) && (b+c>a)){
            if(a == b && a == c){
                System.out.println("Triângulo equilatero.");
            }
            else
                if((a == b) || (a == c) || (b == c)){
                    System.out.println("Triângulo isosceles.");
                }
                else{
                    System.out.println("Triângulo escaleno.");
                }
        }        
        else{
            System.out.println("Não é triangulo");
        }
        in.close();
    }
    
}