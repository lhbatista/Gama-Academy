package projcontas;

public class ContaPoupanca extends Conta{
    private static double taxa; //um único atributo para todos os objetos

    public ContaPoupanca(int numeroConta){
        super(numeroConta);
    }

    public static void setTaxa(double taxaPoup){
        if( taxaPoup > 0){
            taxa = taxaPoup;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public boolean saque(double valor) {
        if(valor + taxa <= getSaldo() ){
            return super.saque(valor + taxa);
        }else{
            return false;
        }
    }

}