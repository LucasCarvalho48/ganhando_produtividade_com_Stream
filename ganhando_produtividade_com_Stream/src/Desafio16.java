import java.util.List;

public class Desafio16 {
    //Utilize a Stream API para agrupar os números em duas listas separadas,
    // uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
    public static void desafio(List<Integer> numeros) {
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impares = numeros.stream().filter(n -> n % 2 == 1).toList();

        System.out.println(pares);
        System.out.println(impares);
    }
}
