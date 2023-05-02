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
