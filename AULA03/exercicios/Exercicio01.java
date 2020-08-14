package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        int cont;

        cont = 100;

        while (cont <= 200) { // repete enquanto a condição for verdadeira
            System.out.println(cont);
            cont++; // cont = cont + 1;
        }

        System.out.println("Fim do Programa");
        cont = 200;

        while (cont >= 100) { // repete enquanto a condição for verdadeira
            System.out.print(cont + " ");
            cont--; // cont = cont - 1;
        }

        System.out.println("Fim do Programa");

    }

}