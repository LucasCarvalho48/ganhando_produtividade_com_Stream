import java.util.List;


public class Desafio17 {
    //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        numeros.stream().filter(Desafio14::isPrime).forEach(System.out::println);
    }
}
