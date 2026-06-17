import java.util.Scanner;

/*
JAVA-07 – Vetores e Matrizes (Arrays)
Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela
 */
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Vetor com valores inteiros não ordenados e não repetidos.
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;

        System.out.print("Digite um número inteiro para pesquisar no vetor: ");
        numero = sc.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Não foi encontrado!");
        }

        sc.close();

    }
}