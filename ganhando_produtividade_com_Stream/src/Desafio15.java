import java.util.List;

public class Desafio15 {
    //Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        boolean resultado = numeros.stream().anyMatch(n -> n < 0);

        if (resultado) System.out.println("A lista contém pelo menos um número negativo.");
        else System.out.println("A lista não contém números negativos.");
    }
}
