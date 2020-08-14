package projcontas;

//classe abstrata não permite instanciar objetos

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //métodos abstratos devem ser obrigatoriamente escritos nas classes derivadas
    public abstract String exibir();

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public boolean saque(double valor) {
        if (valor > 0) {
            saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

}