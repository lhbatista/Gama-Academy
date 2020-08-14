package AULA01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        double salmin, qtdconsu, valorpkw, valortotal,desc; 

        Scanner entrada = new Scanner (System.in);

        System.out.println("Qual é o salário Minimo atual?");
        
        salmin = entrada.nextDouble();
     
    System.out.println("Qual consumo de quilowatt da residencia?");
    
        qtdconsu = entrada.nextDouble();
    
    valorpkw = salmin/500;
    valortotal = valorpkw*qtdconsu;
    desc = valortotal-(valortotal*15)/100;
    System.out.println("De acordo com seu salário, cada quilowatt consumido sera cobrado: R$"+valorpkw);
    System.out.println("O valor da sua conta será: R$"+valortotal+". Tendo em vista seu consumo de "+qtdconsu);
    System.out.println("Com o desconto de 15%, o valor será de: R$"+desc);  
       
 
    }
}