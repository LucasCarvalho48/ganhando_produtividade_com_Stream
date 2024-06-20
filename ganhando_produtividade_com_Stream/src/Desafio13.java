import java.util.List;

public class Desafio13 {
    //Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        numeros.stream().filter(n -> n >= 5 && n <= 10).forEach(System.out::println);
    }
}
