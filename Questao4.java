//Faça um programa que receba um valor que foi depositado e exiba o valor com
//rendimento após um mês, escolha por meio de uma estrutura de caso 3 tipos de
//rendimentos:
//a. Poupança em 0,90% a. m.
//b. CDB em 1,1% a.m.
//c. Previdência Privada 1,3% a.m.
//Apresente o rendimento no próximo mês e ao final de 12 meses qual será o
//rendimento total, conforme a escolha.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor a ser depositado: ");
        double deposito = scanner.nextDouble();
        System.out.println("Escolha o rendimento desejado: ");
        System.out.println("1 - Poupança 0,90% ao mês.");
        System.out.println("2 - CDB em 1,1% ao mês. ");
        System.out.println("3 - Previdência Privada 1,3% ao mês.");
        int escolha = scanner.nextInt();

        double rendimento = 0.0;

        switch (escolha) {
            case 1:
                rendimento = deposito * 0.09;
                break;
            case 2:
                rendimento = deposito * 0.11;
                break;
            case 3:
                rendimento = deposito * 0.13;
                break;
            default:
                System.out.println("Essa opção é inválida.");
        }
        double rendimentoTotal = deposito + rendimento;
        System.out.println("Valor total após um mês: R$" + rendimentoTotal);
        for (int i = 2; i <= 12; i++) {
            rendimentoTotal += rendimentoTotal * deposito;
        }
        double valorTotal = rendimentoTotal - deposito;
        System.out.println("Valor total após 12 meses: R$" + valorTotal);
    }
}
