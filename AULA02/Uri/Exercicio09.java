package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media, exame;
        int faltas;

        System.out.println("Digite a primeira nota:");
        nota1 = in.nextFloat();
        System.out.println("Digite a segunda nota:");
        nota2 = in.nextFloat();
        System.out.println("Digite a terceira nota:");
        nota3 = in.nextFloat();
        System.out.println("Digite a quarta nota:");
        nota4 = in.nextFloat();

        System.out.println("Digite o número de faltas:");
        faltas = in.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(faltas >= 16){
            System.out.println("Aluno reprovado por faltas.");
        }else{
            if(media >= 6){
                System.out.println("Aluno aprovado. Parabéns!");
            }else{
                System.out.println("Digite a nota do exame:");
                exame = in.nextFloat();

                media = (media + exame) / 2;

                if(media >= 5){
                    System.out.println("Aluno aprovado. Parabéns!");
                }else{
                    System.out.println("Aluno reprovado.");
                }
            }
        }

        System.out.println("Média final: " + media);

        in.close();

    }
}