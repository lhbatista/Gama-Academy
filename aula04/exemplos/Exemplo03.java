package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        int resp;

        resp = soma(20, 13);

        System.out.println("A soma vale " + resp);
    }

    //um método com 2 parâmtros e um retorno
    public static int soma(int n1, int n2){
        int resposta;

        resposta = n1 + n2;

        return resposta;
    }

}