import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Informe o valor de B: ");
        int b = scanner.nextInt();

        int troca = a;
        a = b;
        b = troca;

        System.out.println("Valores normais: A= "+troca+ ", B ="+b);
        System.out.println("Valores invertidos: A= "+a+ ", B ="+troca);
    }
}
