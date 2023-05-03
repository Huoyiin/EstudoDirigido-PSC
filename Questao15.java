import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = leia.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = leia.nextDouble();
        System.out.print("Digite o operador (1 = +,2 = -, 3 = *, 4 = /): ");
        int operador = leia.nextInt();

        double resultado = 0;

        switch (operador) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado da soma é " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println("Resultado da subitração é " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println("Resultado da multiplicação é " + resultado);
                break;
            case 4:
                resultado = a / b;
                System.out.println("Resultado da divisão é " + resultado);
                break;
        }
    }
}
