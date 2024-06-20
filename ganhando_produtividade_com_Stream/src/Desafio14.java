import java.util.*;
import java.util.stream.Collectors;

public class Desafio14 {
    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void desafio(List<Integer> numeros) {
        Set<Integer> primos = numeros.stream().filter(Desafio14::isPrime).collect(Collectors.toSet());
        Optional<Integer> resposta = primos.stream().distinct().min(Comparator.reverseOrder());
        System.out.println(resposta.get());
    }
}
