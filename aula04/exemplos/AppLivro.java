package exemplos;

import java.util.Scanner;

public class AppLivro {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String titulo;


        System.out.println("Informe o título do livro:");
        titulo = in.nextLine();
        Livro livro1 = new Livro(titulo, "LTC", "Deitel", 457);

        System.out.println("Informe o título do livro:");
        titulo = in.nextLine();
        Livro livro2 = new Livro(titulo, "Alta Books", "Silbershatz", 300);

        livro1.emprestar();

        boolean possoEmprestar = livro1.estaDisponivel();

        if(possoEmprestar){
            System.out.println("O livro " + livro1.titulo + " está disponível");
        }else{
            System.out.println("O livro " + livro1.titulo + " não está disponível");
        }

        if(livro2.estaDisponivel()){
            System.out.println("O livro " + livro2.titulo + " está disponível");
        }else{
            System.out.println("O livro " + livro2.titulo + " não está disponível");
        }

        System.out.println( "Livros cadastrados");
        livro1.exibir();
        livro2.exibir();

        System.out.println(livro1.getDados());
        System.out.println(livro2.getDados());

        in.close();
    }
}