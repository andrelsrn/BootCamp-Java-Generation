import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
Atividade 01 – Fila
Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila
0: O programa deve ser finalizado.
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.

 */
public class Task12 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n*************************************************");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Retirar uma pessoa da fila");
            System.out.println("0: Sair");
            System.out.println("*************************************************");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o cache do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println("\nFila: " + fila);
                    System.out.println("Cliente Adicionado!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila: " + fila);
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("\nFila: " + fila);
                        System.out.println("O Cliente " + chamado + " foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}