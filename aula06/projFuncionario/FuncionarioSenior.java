package projFuncionario;

public class FuncionarioSenior extends Funcionario{

    private float bonus;

    public FuncionarioSenior(String nome, int horas, float valorHora, float bonus){
        super(nome, horas, valorHora); //construtor da classe Funcionário
        this.bonus = bonus;
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + getHorasTrabalhadas() / 10 * this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + bonus;
    } 

}