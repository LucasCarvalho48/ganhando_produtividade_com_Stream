import java.util.List;

public class Desafio12 {
    //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        int resposta = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("O produto de todos os números da lista: " + resposta);
    }
}
