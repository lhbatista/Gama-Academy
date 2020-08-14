package projloja;

public class AppLoja {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos","carlos@carlos.com");
        ClienteVip c2 = new ClienteVip("Marcela","marcela@gmail.com", 100, "Marquinhos","mq@hotmail.com");

        c1.colocarCredito(100);

        if( c1.fazerCompra(200) ){
            System.out.println("Compra feita com sucesso.");
        }else{
            System.out.println("A compra não foi feita.");

        }

        if( c2.fazerCompra(50) ){
            System.out.println("Compra feita com sucesso.");
        }else{
            System.out.println("A compra não foi feita.");
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}