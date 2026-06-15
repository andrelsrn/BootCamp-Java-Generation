import java.util.Scanner;
/*
Laço Condicional If
Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        // Tratamento especial para o zero
        if (num == 0) {
            System.out.printf("O número %d é par e neutro!%n", num);
        }
        // Bloco Principal: Se for PAR
        else if (num % 2 == 0) {
            if (num > 0) {
                System.out.printf("O número %d é par e positivo!%n", num);
            } else {
                System.out.printf("O número %d é par e negativo!%n", num);
            }
        }
        // Bloco Principal: Se for ÍMPAR
        else {
            if (num > 0) {
                System.out.printf("O número %d é ímpar e positivo!%n", num);
            } else {
                System.out.printf("O número %d é ímpar e negativo!%n", num);
            }
        }
        sc.close();
    }
}
