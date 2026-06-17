import java.util.Locale;
import java.util.Scanner;
/*
Lista 02 - Matrizes :
Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante.
Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        final int ALUNOS = 10;
        final int BIMESTRES = 4;

        double[][] notas = new double[ALUNOS][BIMESTRES];
        double[] medias = new double[ALUNOS];

        // 1. Entrada de dados
        System.out.println("Digite as notas dos participantes:");
        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("\nNotas do participante " + (i + 1) + ":");
            for (int j = 0; j < BIMESTRES; j++) {
                System.out.print("Bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // 2.Cálculo das Médias e preenchimento do Vetor
        for (int i = 0; i < ALUNOS; i++) {
            double soma = 0.0;
            for (int j = 0; j < BIMESTRES; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / BIMESTRES;
        }

        // 3.Exibição do Vetor de Médias
        System.out.println("\n--- VETOR DE MÉDIAS ---");
        for (int i = 0; i < ALUNOS; i++) {
            // "%.1f" garante a exibição com apenas uma casa decimal
            System.out.printf("[%.1f] ", medias[i]);
        }
        System.out.println();

        scanner.close();
    }
}
