import java.util.Random;
import java.util.Scanner;

class game{
    public static void main(String[] args) {
        // Criar o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Criar o gerador de números aleatórios
        Random random = new Random();
        
        // Gerar o número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;
        
        int tentativas = 0;
        int palpite = 0;
    
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar qual é!");
    
        // Loop para o jogo
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();  // Lê o palpite do usuário
            tentativas++;
    
            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior! Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
                System.out.println("Número de tentativas: " + tentativas);
            }
        }
        // Fechar o scanner após o uso
        scanner.close();
    }
}
