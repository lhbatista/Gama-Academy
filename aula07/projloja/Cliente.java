package projloja;

public class Cliente {
    private String nome;
    private String email;
    private float credito;
    private Dependente dependente;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.credito = 0;
        this.dependente = new Dependente();
    }

    public Cliente(String nome, String email, String nomeDep, String emailDep) {
        this.nome = nome;
        this.email = email;
        this.credito = 0;
        this.dependente = new Dependente(nomeDep, emailDep);
    }

    public float getCredito() {
        return credito;
    }

    protected void setCredito(float credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return nome + " : " + email + " : " + credito + "\n"+
            "Dependente: " + dependente.toString();
    }

    public boolean fazerCompra(float valor) {
        if (valor > 0 && credito >= valor) {
            credito = credito - valor;
            return true;
        }
        return false;
    }

    public boolean colocarCredito(float valor) {
        if (valor > 0) {
            credito = credito + valor;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Dependente getDependente() {
        return dependente;
    }

}