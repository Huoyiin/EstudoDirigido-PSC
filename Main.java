import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Informe o total de vendas que vendedor possui no mês: ");
        int vendas = scanner.nextInt();

        double comissao = vendas * 15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do Vendedor: "+nome);
        System.out.println("Salário Fixo: R$"+salarioFixo);
        System.out.println("Salário Final: R$"+salarioFinal);
    }
}