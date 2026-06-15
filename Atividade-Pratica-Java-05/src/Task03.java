import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro).
A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 */
public class Task03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do Produto: ");
        int codigo = sc.nextInt();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        // Variáveis para armazenar o nome e o preço do produto selecionado
        String produto = "";
        double precoUnitario = 0.0;
        boolean codigoValido = true;

        // Estrutura Condicional Switch para definir o produto e o preço
        switch (codigo) {
            case 1:
                produto = "Cachorro Quente";
                precoUnitario = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                precoUnitario = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                precoUnitario = 18.00;
                break;
            case 4:
                produto = "Bauru";
                precoUnitario = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 6:
                produto = "Suco de laranja";
                precoUnitario = 13.00;
                break;
            default:
                System.out.println("Código de produto inválido!");
                codigoValido = false;
                break;
        }

        // Se o código for válido, calcula o total e exibe o resultado
        if (codigoValido) {
            double valorTotal = quantidade * precoUnitario;

            System.out.println();
            System.out.printf("Produto: %s%n", produto);
            System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        }

        sc.close();
    }
}
