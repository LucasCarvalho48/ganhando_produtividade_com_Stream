import java.util.List;

public class Desafio3 {
    //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        boolean resposta = numeros.stream().allMatch(n -> n > 0);
        if (resposta) System.out.println("Não temos números negativo.");
        else System.out.println("Temos números negativos.");
    }
}
