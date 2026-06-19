import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio03 {
    // Estoque: nome -> quantidade (LinkedHashMap para manter ordem de inserção)
    static Map<String, Integer> estoque = new LinkedHashMap<>();

    static void adicionar(String nome, int qtd) {
        estoque.put(nome, qtd);
    }

    static void atualizar(String nome, int novaQtd) {
        estoque.put(nome, novaQtd);
    }

    static void listar() {
        for (Map.Entry<String, Integer> e : estoque.entrySet())
            System.out.println("Produto: " + e.getKey() + " | Quantidade: " + e.getValue());
    }

    public static void main(String[] args) {
        // Exemplo de uso (sucinto, sem validações)
        adicionar("Teclado", 10);
        adicionar("Mouse", 25);
        atualizar("Teclado", 12);
        listar();
    }
}

