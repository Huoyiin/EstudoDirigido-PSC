// Escreva classe com um método que será usado em todo sistema que recebe, por
//parâmetro, dois valores X e Z e calcula e retorna o valor de X elevado a Z.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de z: ");
        int z = scanner.nextInt();

        double resul = calcularPot(x, z);
        System.out.println(x + " elevado a " + z + ": " + resul);
    }
    public static double calcularPot(int x, int z) {
        return Math.pow(x, z);
    }
    }
