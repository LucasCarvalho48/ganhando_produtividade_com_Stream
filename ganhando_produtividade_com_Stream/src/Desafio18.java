import java.util.List;
import java.util.Objects;

public class Desafio18 {
    //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        boolean resultado = numeros.stream().allMatch(n -> Objects.equals(n, numeros.get(1)));
        if (resultado)System.out.println("Todos os números da lista são iguais.");
        else System.out.println("Nem todos os números da lista são iguais.");
    }
}
