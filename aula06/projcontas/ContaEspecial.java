package projcontas;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numeroConta, double limite){
        super(numeroConta);
        setLimite(limite);
    }

    public void setLimite(double limite) {
        if(limite > 0){
            this.limite = limite;
        }
    }

    @Override
    public boolean saque(double valor) {
        if(valor <= getSaldo() + limite){
            return super.saque(valor);
        }else{
            return false;
        }
    }

}