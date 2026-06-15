import java.util.Scanner;

/*
Laço Condicional If :
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
 e imprima na tela se a soma de A + B é maior, menor ou igual a C
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = sc.nextInt();

        int soma = A + B;

        if (soma > C) {
            System.out.println("A soma de A + B é maior que C.");
        } else if (soma < C) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B é igual a C.");
        }

        sc.close();
    }
}