package exemplos;

public class Exemplo02 {

    public static void main(String[] args) {

        linha1();
        linha2('*');
        linha3('-', 25);

    }

    // um método sem parâmetros nem retorno
    public static void linha1() {
        System.out.println("-------------------");
    }

    // um método com um parâmetro, e sem retorno
    public static void linha2(char simbolo) {

        for (int i = 0; i < 10; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    // um método com dois parâmetros, e sem retorno
    public static void linha3(char simbolo, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }



}