package projFuncionario;

public class Funcionario {
    private String nome;
    private int horasTrabalhadas;
    private float valorPorHora;


    public Funcionario(String nome, int horas, float valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horas;
        this.valorPorHora = valorHora;
    }

    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    public float calculaSalario(){
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String toString() {
        return nome + " : " + valorPorHora + " : " + horasTrabalhadas;
    } 

}