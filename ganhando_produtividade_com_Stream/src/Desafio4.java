import java.util.List;

public class Desafio4 {
    //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
    public static void desafio (List<Integer> numeros){
         numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }
}
