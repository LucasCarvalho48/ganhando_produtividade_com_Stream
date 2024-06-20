import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        Optional<Integer> segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        segundoMaior.ifPresent(System.out::println);
    }
}
