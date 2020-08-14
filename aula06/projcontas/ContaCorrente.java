package projcontas;

public class ContaCorrente extends Conta{
    
    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.1);
    }

    @Override
    public boolean saque(double valor){
        if(valor > 0 && valor <= getSaldo()){
            super.saque(valor);
            return true;
        }else{
            return false;
        }
    }

}