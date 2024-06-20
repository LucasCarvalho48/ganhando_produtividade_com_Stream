import java.util.List;

public class Desafio11 {
    //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
    public static void desfio(List<Integer> numeros) {
        int resposta = numeros.stream().mapToInt(n -> n *= n).sum();
        System.out.println("Soma dos números: " + resposta);
    }
}
