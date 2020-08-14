package samples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Sample02 {
    public static void main(String[] args) {

        Queue<Integer> fila = new LinkedList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            fila.add( rnd.nextInt(50) + 1 );
        }

        while (!fila.isEmpty()) {
            System.out.print(fila.remove() + " ");
        }

    }
}