import java.util.Scanner;
import java.util.Stack;

public class Task13 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n*************************************************");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da Pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Sair");
            System.out.println("*************************************************");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String livro = leia.nextLine();
                    pilha.push(livro); // Adiciona no topo
                    System.out.println("\nPilha: " + pilha);
                    System.out.println("Livro adicionado!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha: " + pilha);
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!"); // Validação solicitada
                    } else {
                        String retirado = pilha.pop(); // Retira do topo
                        System.out.println("\nPilha: " + pilha);
                        System.out.println("Um Livro (\"" + retirado + "\") foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        leia.close();
    }
}
