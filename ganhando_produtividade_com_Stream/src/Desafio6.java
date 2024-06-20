import java.util.List;

public class Desafio6 {
    //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
    public static void desafio (List<Integer> numeros){
        boolean resposta = numeros.stream().allMatch(n -> n <= 10);
        if (resposta) System.out.println("Não temos números maiores que 10.");
        else System.out.println("Temos números maiores que 10.");
    }
}
