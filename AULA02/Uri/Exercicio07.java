package Uri;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salario;

        System.out.println("Digite o salário:");
        salario = in.nextDouble();

        in.close();

        if ( salario <=600 ){

            System.out.println("Isento do desconto do INSS");
        }    
        else 
            if(salario <=1200.00){
                System.out.println("O desconto do INSS é de: " + salario * 0.20);
            } 
            else
                if (salario <= 2000.00){
                System.out.println("O desconto do INSS é de: " + salario * 0.25);
            }
                else
                  {
                     System.out.println("O desconto do INSS é de: " + salario * 0.30);     

            }
        }        
}