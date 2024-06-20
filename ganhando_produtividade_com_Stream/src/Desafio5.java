import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
    //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        OptionalDouble resultado = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue).average();
        if (resultado.isEmpty()) System.out.println("Não temos uma média");
        else System.out.println("A média dos números maiores que 5: " + resultado.getAsDouble());
    }
}
