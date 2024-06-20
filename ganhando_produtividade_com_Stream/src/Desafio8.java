import java.util.List;

public class Desafio8 {
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        int resposta = numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma: " + resposta);
    }
}
