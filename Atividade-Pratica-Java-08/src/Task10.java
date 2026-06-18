import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Lista 01 – Collection List
Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:

-> Mostre na tela todas as cores que foram adicionadas.
-> Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();

        System.out.println("Digite 5 cores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String color = sc.nextLine();

            // Validação: Repete enquanto o texto NÃO contiver apenas letras/espaços ou estiver vazio.
            // Alem de letras, permite tambem caracteres especias do portugues e um espaço para caso de palavras compostas.//
            while (!color.matches("[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+") || color.trim().isEmpty()) {
                System.out.println("Entrada inválida! Digite apenas letras (números e símbolos não são permitidos).");
                System.out.print("Cor " + (i + 1) + ": ");
                color = sc.nextLine();
            }
            colors.add(color);
        }

        // Exibe as cores adicionadas
        System.out.println("\nCores adicionadas:");
        for (String color : colors) {
            System.out.println(capitalize(color));
        }

        //  Ordena as cores em ordem crescente
        Collections.sort(colors);
        System.out.println("\nCores em ordem crescente:");
        for (String color : colors) {
            System.out.println(capitalize(color));
        }

        sc.close();
    }

    // Metodo para capitalizar a primeira letra e deixar o restante em minúsculo
    private static String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
}


