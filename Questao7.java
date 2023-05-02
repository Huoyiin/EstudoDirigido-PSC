import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carros2010 = 0;
        int total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Informe o ano do carro: ");
            int ano = scanner.nextInt();
            System.out.println("Informe o preço do carro: R$");
            double preco = scanner.nextDouble();
            double desc;
            if (ano <= 2010) {
                desc = 0.12;
                carros2010++;
            } else {
                desc = 0.07;
            }
            double valorCdesc = preco - desc;
            double valorDesc = preco * desc;
            total += valorCdesc;
            System.out.println("Desconto de: "+valorDesc+" "+desc*100+"%");
            System.out.println("Valor a pagar: " + valorCdesc);
            System.out.println("Gostaria de continuar calculando? (S/N)");
            char resp = scanner.next().charAt(0);
            continuar = resp=='S'||resp=='s';
        }
        System.out.println("Total carros até o ano 2010: " + carros2010);
        System.out.println("Total geral: " + total);
    }
}
