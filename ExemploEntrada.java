import java.util.Scanner;

public class ExemploEntrada {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        // Solicita ao usuário que insira a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Consome a linha em branco deixada pelo nextInt()
        scanner.nextLine();
        
        // Solicita o hobby
        System.out.print("Digite seu hobby: ");
        String hobby = scanner.nextLine();
        
        // Exibe os valores digitados
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos. Seu hobby é " + hobby + ".");
        
        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
