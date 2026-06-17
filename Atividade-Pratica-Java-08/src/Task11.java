import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
/*
Lista 02 – Collection Set
Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
-> Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.

 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Digite 10 números inteiros:");

        // O laço roda EXATAMENTE 10 vezes, independente do que o usuário digitar
        for (int i = 0; i < 10; i++) {
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                scanner.next();
            }
            int number = scanner.nextInt();

            // Adiciona no Set. Se for repetido, o Set ignora silenciosamente
            numbers.add(number);
        }

        System.out.println("\nListar dados do Set:");

        // O Iterator vai mostrar apenas os números que restaram.
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
