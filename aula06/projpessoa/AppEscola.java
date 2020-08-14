package projpessoa;

public class AppEscola {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("Emerson", "rua X", "112345-6789", 1234, "CCO", 2000);
        Professor professor = new Professor("Huguinho", "rua Y", "119876-9876", "Dr", "Unifesp", 8000);


        estudante.setNome("Marcos");

        System.out.println("RA: " + estudante.getRa());
        System.out.println("Estudante: " + estudante.getNome());

        System.out.println("Professor: " + professor.getNome());

        System.out.println(estudante.exibirDados());
        System.out.println(professor.exibirDados());

        System.out.println(estudante);

    }
}