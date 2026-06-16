import java.util.Scanner;

/*
EXERCÍCIO 1 – Análise de Idade e Acesso
 */
public class Teste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Autorização (true/false): ");
        boolean temAutorizacao = sc.nextBoolean();

        // 2. Estrutura de Decisão e Operadores Lógicos

        // Condição 1: Maioridade
        if (idade >= 18) {
            System.out.printf("Acesso liberado para %s.%n", nome);
        }
        // Condição 2: Menor de idade E possui autorização
        else if (idade < 18 && temAutorizacao) {
            System.out.printf("Acesso liberado com autorização para %s.%n", nome);
        }
        else {
            System.out.printf("Acesso negado para %s.%n", nome);
        }

        sc.close();

    }
}