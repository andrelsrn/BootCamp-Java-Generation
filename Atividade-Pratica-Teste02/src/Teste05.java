/*
EXERCÍCIO 2 – Cadastro de Alunos
Crie um algoritmo que simule um cadastro simples de alunos:
Utilize uma coleção para armazenar os alunos.
Cada aluno deve ser representado da seguinte forma:
Nome
Idade
Nota final
Crie as funcionalidades para:
Adicionar um aluno a uma coleção
Listar todos os alunos cadastrados
Calcular a média geral das notas
Utilize loops para percorrer a coleção de alunos.
Saída esperada:
Exiba:
A coleção de alunos com suas informações
A média geral das notas

 */
import java.util.Scanner;

public class Teste05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int totalAlunos = sc.nextInt();
        sc.nextLine();

        // Criando os arrays paralelos com o tamanho digitado pelo usuário
        String[] nomes = new String[totalAlunos];
        int[] idades = new int[totalAlunos];
        double[] notasFinais = new double[totalAlunos];

        //Adicionar alunos às coleções
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("\n--- Cadastrando Aluno #" + (i + 1) + " ---");

            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Nota Final: ");
            notasFinais[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();

        // Listar todos os alunos cadastrados
        System.out.println("\n--- Alunos Cadastrados ---");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Nome: " + nomes[i] + " | Idade: " + idades[i] + " | Nota: " + notasFinais[i]);
        }

        // Calcular e exibir a média geral das notas
        double somaTotal = 0;
        for (int i = 0; i < totalAlunos; i++) {
            somaTotal += notasFinais[i]; // Acumula a nota de cada posição [i]
        }

        double mediaGeral = somaTotal / totalAlunos;
        System.out.printf("\nMédia Geral das Notas: %.2f\n", mediaGeral);
    }
}