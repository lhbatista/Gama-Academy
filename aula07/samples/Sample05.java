package samples;

import java.util.Hashtable;

public class Sample05 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash = new Hashtable<>();
        int num;

        hash.put(1, "Um");
        hash.put(2, "Dois");
        hash.put(3, "Três");
        hash.put(4, "Quatro");

        System.out.println("Digite um valor de 1 à 9:");
        num = 4;

        System.out.println(hash.get(num));

    }
}