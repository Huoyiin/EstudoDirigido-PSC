//Faça uma classe com um método que será usado em todo sistema que recebe 3 valores
//inteiros passados por parâmetro e retorna-os ordenados em ordem crescente.

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 3;

        int[] numeros = {a, b, c};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
