import java.util.Scanner;

/*
Lista 03 - Laço de Repetição DO…WHILE
Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. Ao final,
 mostre na tela a soma de todos os números digitados, que sejam positivos.
 */
public class Task07 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numero;
    int somaPositivos = 0;

    // O bloco do...while garante que o código rode pelo menos uma vez antes de testar a condição
    do {
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        // Verifica se o número digitado é positivo
        if (numero > 0) {
            somaPositivos += numero;
        }

    } while (numero != 0); // O laço continua executando enquanto o número for diferente de zero

    System.out.println("\nA soma dos números positivos é: " + somaPositivos);

    sc.close();

    }
}
