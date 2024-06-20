import java.util.List;

public class Desafio1 {
    //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
    public static void desafio(List<Integer> numeros) {
        numeros.stream().sorted().forEach(System.out::println);
    }
}
