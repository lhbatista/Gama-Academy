package Uri;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String senha;

        System.out.println("Digite a senha");
        senha = in.nextLine();

        in.close();

        if (senha.equals ("R10p5")) {

            System.out.println("Acesso concedido");
        }    
        else {

            System.out.println("Acesso negado");

        }    

    
    }

}