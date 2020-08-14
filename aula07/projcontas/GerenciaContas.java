package projcontas;

import java.util.ArrayList;

public class GerenciaContas {

    private ArrayList<Conta> listaContas;

    public GerenciaContas() {
        listaContas = new ArrayList<>();
    }

    public void novaConta(Conta conta) {
        listaContas.add(conta);
    }

    public String getInfo(int numeroConta) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.exibir();
            }
        }
        return ("Conta não encontrada.");
    }

    public String efetuarSaque(int numeroConta, float valor) {
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                if (c.saque(valor)) {
                    return ("Saque efetuado.");
                } else {
                    return ("Saque não efetuado.");
                }
            }
        }
        return ("Conta não encontrada.");
    }

    public boolean efetuarDeposito(int numeroConta, float valor){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                c.depositar(valor);
                return true;
            }
        }
        return false;
    } 

}