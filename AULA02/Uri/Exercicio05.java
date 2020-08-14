package Uri;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in  = new Scanner (System.in);

        float salario, prestacao;

        System.out.println("Digite o salario bruto:");
        salario = in.nextFloat();

        System.out.println("Digite o valor da prestação");
        prestacao = in.nextFloat();

        if (prestacao <= (salario * 0.3)){

            System.out.println("Emprestimo aprovado");
        }else{
            System.out.println("Emprestimo negado");
        }
            
        in.close();
    }
    
}