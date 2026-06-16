import java.util.Locale;
import java.util.Scanner;

/*
EXERCÍCIO 3 – Simulação de Calculadora
 */
public class Teste03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //MENU
        System.out.println("=====================================");
        System.out.println("        CALCULADORA GENERATION       ");
        System.out.println("=====================================");
        System.out.println("|  CÓDIGO  |       OPERAÇÃO         |");
        System.out.println("-------------------------------------");
        System.out.println("|    1     |  Soma                  |");
        System.out.println("|    2     |  Subtração             |");
        System.out.println("|    3     |  Multiplicação         |");
        System.out.println("|    4     |  Divisão               |");
        System.out.println("=====================================");
        System.out.println(); // Linha em brancO.

        // Entrada de dados
        System.out.print("Digite o Primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o Segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Escolha o Código da operação (1-4): ");
        int operacao = sc.nextInt();

        String nomeOperacao = "";
        double resultado = 0.0;
        boolean operacaoValida = true;

        // Estrutura de Decisão
        if (operacao == 1) {
            nomeOperacao = "Soma";
            resultado = num1 + num2;
        }
        else if (operacao == 2) {
            nomeOperacao = "Subtração";
            resultado = num1 - num2;
        }
        else if (operacao == 3) {
            nomeOperacao = "Multiplicação";
            resultado = num1 * num2;
        }
        else if (operacao == 4) {
            nomeOperacao = "Divisão";
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("\n[ERRO]: Não é possível dividir por zero.");
                operacaoValida = false;
            }
        }
        else {
            System.out.println("\n[ERRO]: Código de operação inválido.");
            operacaoValida = false;
        }

        // Saída formatada.
        if (operacaoValida) {
            System.out.println("-------------------------------------");
            if (resultado % 1 == 0) {
                System.out.printf("Operação: %s Resultado: %.0f%n", nomeOperacao, resultado);
            } else {
                System.out.printf("Operação: %s Resultado: %.2f%n", nomeOperacao, resultado);
            }
            System.out.println("=====================================");
        }

        sc.close();

    }
}
