package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cont, num, soma =0, pos =0;

        for(cont = 1; cont <= 10; cont++){
            num = in.nextInt();
            soma=soma+num;
            if (num > 0) {
                pos++;
            }
            in.close();

        }
        
       System.out.println("" +soma);
       System.out.println("" + pos);
       System.out.println("" + (soma/10));
       System.out.println("" +(pos*10)+"%");
      
    }
    
}