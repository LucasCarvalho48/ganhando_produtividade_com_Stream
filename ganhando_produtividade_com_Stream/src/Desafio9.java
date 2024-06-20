import java.util.HashSet;
import java.util.List;

public class Desafio9 {
    //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        boolean resposta = numeros.stream().allMatch(new HashSet<>()::add);

        if (resposta) System.out.println("Todos os números são distintos.");
        else System.out.println("Há números repetidos na lista.");
    }
}
