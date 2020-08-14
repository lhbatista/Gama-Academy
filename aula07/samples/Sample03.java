package samples;

import java.util.TreeSet;

public class Sample03 {
    public static void main(String[] args) {
        int numeros[] = { 2, 4, 1, 6, 3, 7, 9, 5 };
        TreeSet<Integer> tree = new TreeSet<>();

        for (int numero : numeros) { // para cada número do vetor numeros
            tree.add(numero);
        }

        for (int numero : tree) {
            System.out.print(numero + " ");
        }

    }
}