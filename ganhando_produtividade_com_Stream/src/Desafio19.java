import java.util.List;

public class Desafio19 {
    //Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
    public static void desafio(List<Integer> numeros) {
        List<Integer> resposta = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).toList();
        if (resposta.isEmpty())
            System.out.println("Não temos números na lista que são divisíveis tanto por 3 quanto por 5");
        else System.out.println(resposta);
    }
}
