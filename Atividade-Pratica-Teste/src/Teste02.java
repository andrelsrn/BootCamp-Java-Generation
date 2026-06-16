import java.util.Locale;
import java.util.Scanner;

/*
EXERCÍCIO 2 – Classificação de Nota do Aluno
 */
public class Teste02 {
    public static void main(String[] args) {

    // Configura o ponto como separador decimal (ex: 6.5)
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // 1. Variáveis e Tipos (Conteúdo Obrigatório)
    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Nota: ");
    double nota = sc.nextDouble();

    // Variável para armazenar a situação final do aluno
    String situacao;

    // 2. Estrutura de Decisão e Operadores Relacionais (Conteúdos Obrigatórios)

    // Regra 1: Nota maior ou igual a 7
    if (nota >= 7.0) {
        situacao = "Aprovado";
    }
    // Regra 2: Nota maior ou igual a 5 E menor que 7 (Uso dos operadores relacionais e do lógico &&)
    else if (nota >= 5.0 && nota < 7.0) {
        situacao = "Recuperação";
    }
    // Regra 3: Nota menor que 5
    else {
        situacao = "Reprovado";
    }

    // 3. Saída esperada formatada
    System.out.printf("Aluno: %s Situação: %s%n", nome, situacao);

    sc.close();
    }
}
