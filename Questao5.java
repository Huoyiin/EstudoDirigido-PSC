import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = scanner.nextInt();
        if (num > 10) {
            System.out.println("O número inserido é maior que 10");
        }
        else {
            System.out.println("O número inserido é menor que 10!");
        }
    }
}
