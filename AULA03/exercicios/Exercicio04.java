package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cont, numero = 0, pares, impares;

        cont =1;
        pares = 0;
        impares = 0;

        while (cont <=10) {
            numero = in.nextInt();
            if (numero % 2 ==0){
                pares++;
            }else{
                impares++;
            }
            cont++;
            
        }
        System.out.printf("Contamos %d par(es) e %d ímpar(es)", pares, impares);      
        in.close();
    }
    
}