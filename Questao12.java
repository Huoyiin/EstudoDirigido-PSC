import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de z: ");
        int z = scanner.nextInt();

        double resul1 = calcularPot(x, z);
        System.out.println(x + " elevado a " + z + ": " + resul1);

        double resul2 = calcularPot2(x, z);
    }

    public static double calcularPot(int x, int z) {
        return Math.pow(x, z);
    }

    public static double calcularPot2(int x, int z) {
        double resultado = 1;
        for (int i = 0; i < z; i++) {
            resultado *= x;
        }
        return resultado;
    }
}
