package samples;

import java.util.ArrayList;

public class Sample06 {
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1, 5); //insere o valor 5 na posição 1 (numeração começa de zero)

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (int numero : lista) {
            if(numero == 5){
                System.out.println("Achei o valor "+ 5 + " na lista.");
                numero++; //muda a variável local, mas não altera o valor na lista
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) == 5){
                lista.set(i, 6); //altera o valor na lista
            }
        }

        for (int numero : lista) {
            System.out.println(numero);
        }
        
    }
}