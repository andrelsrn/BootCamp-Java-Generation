/*
EXERCÍCIO 3 – Controle de Estoque
Desenvolva um algoritmo que simule o controle de um pequeno estoque:
Utilize uma coleção para representar os produtos.
Cada produto deve conter:
Nome do produto
Quantidade em estoque
Crie as funcionalidades para:
Adicionar um novo produto
Atualizar a quantidade de um produto existente
Listar todos os produtos
Utilize loops para percorrer o estoque e exibir as informações.
Exemplo de saída:
Produto: Teclado | Quantidade: 10
Produto: Mouse | Quantidade: 25

 */
import java.util.ArrayList;
import java.util.Scanner;

public class Teste06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        int opcao = 0;
        while (opcao != 4) {
            System.out.print("\n1-Adicionar Produto, 2-Atualizar Quantidade, 3-Listar Produtos, 4-Sair: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    produtos.add(sc.nextLine());
                    System.out.print("Quantidade: ");
                    quantidades.add(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Produto para atualizar quantidade: ");
                    String procurado = sc.nextLine();

                    // Busca simples e direta exigida para atualizar
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).equals(procurado)) {
                            System.out.print("Nova quantidade: ");
                            quantidades.set(i, sc.nextInt());
                            break;
                        }
                    }
                    break;

                case 3:
                    // Loop seco para listar exatamente como pede o exemplo de saída
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Produto: " + produtos.get(i) + " | Quantidade: " + quantidades.get(i));
                    }
                    break;
            }
        }
        sc.close();
    }
}
