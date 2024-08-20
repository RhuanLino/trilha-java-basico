import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TO DO: Importar Scanner
        // TO DO: Campos [Numero, Agencia, Nome, Saldo]
        /*
        TO DO: "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo 
        [Saldo] já está disponível para saque".
        */

        // Definindo Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Implementando atributos de número, agência e nome
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite seu nome e sobrenome: ");
        String nome = scanner.nextLine();
        
        double saldo = 15000;
        
        // Validando as informações
        if (numero == 2247) {
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
        }
        else {
            System.out.println("A conta não existe! Favor verificar os dados.");
        }
        scanner.close();
    }
}
