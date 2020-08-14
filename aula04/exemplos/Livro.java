package exemplos;

/**
 * Livro
 */
public class Livro {

    //atributos do livro : características do livro
    String titulo;
    String editora;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    //método construtor: iniciliza os atributos do objeto
    //ele tem o mesmo nome da classe
    public Livro(String titulo,String editora,String autor, int numeroPaginas){
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    //métodos do livro: ações ou comportamentos do livro
    public void emprestar(){
        disponivel = false;
    } 

    public void devolver(){ //void significa que o método não tem retorno
        disponivel = true;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    //criar um método para exibir os dados de um livro

    public void exibir(){
        String disponibilidade;
        
        if (disponivel) {
            disponibilidade = "disponinivel";
        }else{
            disponibilidade = "indisponivel";
        }
        
        System.out.println("Livro" + titulo + ":" + autor + "," + editora + "-" +numeroPaginas + "-" + disponibilidade);
    }


    public String getDados(){
        String disponibilidade;
        
        if (disponivel) {
            disponibilidade = "disponinivel";
        }else{
            disponibilidade = "indisponivel";
        }
        
        return "Livro" + titulo + ":" + autor + "," + editora + "-" +numeroPaginas + " (" + disponibilidade + ")";

    }
}