//Faça uma classe com um método que será usado em todo sistema que irá verificar se
//um valor é perfeito ou não. Um valor é dito perfeito quando ele é igual a soma dos
//seus divisores excetuando ele próprio. (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são seus
//divisores). O método deve retornar um valor booleano.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (verificacao(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
    }

    public static boolean verificacao(int numero) {
        int somaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == numero;
    }
}
