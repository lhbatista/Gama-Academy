
package AULA01;

//o Scanner não existe no java, não é nativo, portanto é preciso fazer um import da biblioteca
import java.util.Scanner;

public class Sample05 {

    public static void main(String[] args) {
        
        //entrada de dados

        Scanner entrada = new Scanner( System.in );
        
        String textoDigitado;

        System.out.println("Digite o seu nome:");

        textoDigitado = entrada.nextLine();

        System.out.println("Bem vindo " + textoDigitado);    
        
        entrada.close();

    }
    
}