package projloja;

public class ClienteVip extends Cliente {
    private float creditoEspecial;

    public ClienteVip(String nome, String email, float creditoEspecial){
        super(nome, email);
        this.creditoEspecial = creditoEspecial;
    }

    public ClienteVip(String nome, String email, float creditoEspecial, String nomeDep, String emailDep){
        super(nome, email, nomeDep, emailDep);
        this.creditoEspecial = creditoEspecial;
    }

    @Override
    public String toString() {
        return getNome() + " : " + getEmail() + " : " + getCredito() + " limite: " + creditoEspecial + "\nDependente: " + getDependente().toString();
    }

    @Override
    public boolean fazerCompra(float valor){
        if(valor > 0 && getCredito() + creditoEspecial >= valor){
            setCredito(getCredito() - valor);
            return true;
        }
        return false;
    }

}