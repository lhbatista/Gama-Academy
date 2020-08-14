package samples;

import java.util.TreeSet;

public class Sample04 {
    public static void main(String[] args) {

        String nomes[] = { "Ana", "Carlos", "Zeca", "Roberto", "Davi", "Augusto", "Emerson", "Beatriz" };
        TreeSet<String> tree = new TreeSet<>();

        for (String nome : nomes) { // para cada número do vetor numeros
            tree.add(nome);
        }

        for (String nome : tree) {
            System.out.print(nome + " ");
        }
    }
}