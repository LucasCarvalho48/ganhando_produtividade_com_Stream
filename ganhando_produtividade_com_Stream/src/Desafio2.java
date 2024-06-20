import java.util.List;

public class Desafio2 {
    //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        int soma = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        System.out.println("Soma dos pares: " + soma);
    }
}
