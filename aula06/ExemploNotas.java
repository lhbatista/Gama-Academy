import java.util.Scanner;

public class ExemploNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        double notas[] = new double[10];
        double media = 0;
        int cont;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota:");
            notas[i] = in.nextDouble();
            media = media + notas[i];
        }

        media = media / notas.length;

        cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media){
                cont++;
            }
        }

        System.out.println("A media calculada foi:" + media);
        System.out.println("Notas acima da média: " + cont);

        in.close();
    }
}