package projloja;

public class Dependente {
    private String nome;
    private String email;

    public Dependente() {
    }

    public Dependente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if(nome != null && nome.length() > 0)
            return nome + ": " + email;
       return "-";
    }
}