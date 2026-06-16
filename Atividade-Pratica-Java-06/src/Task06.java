import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Lista 02 - Laço de Repetição WHILE
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos.
A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> maioresNaIdade = new ArrayList<>();
        List<Integer> menoresNaIdade = new ArrayList<>();


        while(true) {
            System.out.print("Digite uma idade: ");
            int idade = sc.nextInt();

            // Condição de parada principal.
            if(idade < 0) {
                break;
            }

            if(idade < 21) {
                menoresNaIdade.add(idade);
            } else if(idade > 50) { // 'else if' economiza processamento, pois uma idade não pode ser < 21 e > 50 ao mesmo tempo
                maioresNaIdade.add(idade);
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + menoresNaIdade.size());
        System.out.println("Total de pessoas com mais de 50 anos: " + maioresNaIdade.size());
        System.out.println("Idade das pessoas com menos de 21 anos: " + menoresNaIdade);
        System.out.println("Idade das pessoas com mais de 50 anos: " + maioresNaIdade);

        sc.close();
    }
}
