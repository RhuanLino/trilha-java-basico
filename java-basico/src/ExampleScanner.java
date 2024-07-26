import java.util.Scanner;

/**
 * Este é um código exemplo
 * de um Scanner, que serve
 * como input de argumentos
 * no qual o usuário pode inserir
 * @author Rhuan Lino
 * @since 26/07/2024
 */
public class ExampleScanner {
    
    /**
     * Este exemplo mostra o funcionamento
     * do Scanner, recebendo os valores de
     * nome, sobrenome e idade
     * @param args
     */
    
    public static void main(String[] args) {
        
        //Definindo o Scanner
        
        Scanner scanner = new Scanner(System.in);

        //Implementando os inputs de nome, sobrenome e idade
        
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        //Mostrando os dados digitados

        System.out.println("Seu nome: " + nome + " " + sobrenome);
        System.out.println("Sua idade: " + idade);

    }
}
