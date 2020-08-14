package AULA01;

public class Sample04{
    public static void main(String[] args) {
                   
        //conversão de tipos de dados
        
        int numeroInteiro;
        float numeroFloat;
        
        
        numeroInteiro = 230;
        
        //armazenar um tipo menor em um tipo maior, sem problema
        numeroFloat = numeroInteiro;
        
        numeroFloat = 7.9999f;
        
        
        
        numeroInteiro = (int)numeroFloat;
        
        System.out.println(numeroInteiro);
        System.out.println(numeroFloat);
        
        }        
               

    }

