package samples;

import java.util.Stack;

public class Sample01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
    }
}