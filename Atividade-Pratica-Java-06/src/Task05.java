import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
JAVA-06 – Laços de Repetição
Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
 mostre na tela quantos números são pares e quantos número são ímpares.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Quantidade de números pares: " + pares.size());
        System.out.println("Quantidade de números ímpares: " + impares.size());
        System.out.println("Números pares salvos: " + pares);
        System.out.println("Números ímpares salvos: " + impares);

        sc.close();

    }
}
