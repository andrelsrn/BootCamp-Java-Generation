import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("-------------------------------------");
    System.out.println("---- Cálculo de Aumento Salarial ----");
    System.out.println("-------------------------------------");

    System.out.println("Digite o salário atual do funcionário: ");
    float salarioAtual = sc.nextFloat();

    System.out.println("Digite o Abono salarial: ");
    float abono = sc.nextFloat();

    sc.close();

    float salarioCorrigido = salarioAtual + abono;
    System.out.printf("O salário corrigido do funcionário é: %.2f", salarioCorrigido);


    }
}