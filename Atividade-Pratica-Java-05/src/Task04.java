import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float).
A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
 */
public class Task04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.print("Nome do colaborador: ");
        String nome = sc.nextLine();

        System.out.print("Cargo (Código de 1 a 6): ");
        int codigoCargo = sc.nextInt();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        // Variáveis para guardar os dados que vão mudar conforme o código
        String cargo = "";
        double percentualReajuste = 0.0;
        boolean codigoValido = true;

        // 2. Laço Condicional Switch para definir o Cargo e o Percentual
        switch (codigoCargo) {
            case 1:
                cargo = "Gerente";
                percentualReajuste = 0.10; // 10%
                break;
            case 2:
                cargo = "Vendedor";
                percentualReajuste = 0.07; // 7%
                break;
            case 3:
                cargo = "Supervisor";
                percentualReajuste = 0.09; // 9%
                break;
            case 4:
                cargo = "Motorista";
                percentualReajuste = 0.06; // 6%
                break;
            case 5:
                cargo = "Estoquista";
                percentualReajuste = 0.05; // 5%
                break;
            case 6:
                cargo = "Técnico de TI";
                percentualReajuste = 0.08; // 8%
                break;
            default:
                System.out.println("Código de cargo inválido!");
                codigoValido = false;
                break;
        }

        // 3. Se o código for válido, calcula o reajuste e exibe a Saída
        if (codigoValido) {
            // Fórmula: Novo Salário = salário + (reajuste * salário)
            double novoSalario = salario + (percentualReajuste * salario);

            System.out.println(); // Linha em branco para separar a entrada da saída
            System.out.printf("Nome do colaborador: %s%n", nome);
            System.out.printf("Cargo: %s%n", cargo);
            System.out.printf("Salário: R$ %.2f%n", novoSalario);
        }

        sc.close();
    }
}
