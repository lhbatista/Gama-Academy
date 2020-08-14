package exercicios;

import java.util.Stack;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Stack<Character> pilha = new Stack<>();
        String frase = "Este exercicio é muito fácil";

/*         for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }
 */
        char fraseVetor[] = frase.toCharArray();

/*         for (int i = 0; i < fraseVetor.length; i++) {
            pilha.push(fraseVetor[i]);
        } */

        for (char letra : fraseVetor) { //para cada caracter 'letra' do vetor
            pilha.push(letra);
        }

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }

    }
}