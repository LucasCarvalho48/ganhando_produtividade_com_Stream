import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Desafio10 {
    //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        numeros.stream().filter(n -> (n % 3 == 0 || n % 5 == 0) && (n % 2 == 1)).forEach(System.out::println);
    }
}
