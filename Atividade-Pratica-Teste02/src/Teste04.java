import java.util.Arrays;
import java.util.Scanner;

/*
EXERCÍCIO 1 – coleção de Números e Análise
Desenvolva um algoritmo que:
Crie uma coleção para armazenar 5 números inteiros.
Utilize um loop para percorrer o coleção.
Crie uma função que receba o coleção como parâmetro e retorne:
A soma de todos os números
A média dos valores
O maior número do coleção

 */
public class Teste04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um array vazio que suporta exatamente 5 números
        int[] numbers = new int[5];

        System.out.println("Digite 5 números inteiros:");

        // Loop para ler os números e salvar dentro do array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); // Lê o número digitado e guarda na posição 'i'
        }

        sc.close();

        // Chama a função de análise passando o array preenchido
        analyzeCollection(numbers);
    }

    public static void analyzeCollection(int[] array) {
        int sum = 0;
        int max = array[0];

        for (int number : array) {
            sum += number;
            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / array.length;

        System.out.println("\n--- Saída ---");
        System.out.println("Coleção: " + Arrays.toString(array));
        System.out.println("Soma: " + sum);
        System.out.println("Média: " + average);
        System.out.println("Maior valor: " + max);
    }
}