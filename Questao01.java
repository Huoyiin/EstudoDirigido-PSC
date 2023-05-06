//Escrever um programa para determinar o consumo médio de um automóvel sendo
//fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a distância percorrida pelo veículo (km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Informe o total de combustível gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumo = distancia/combustivel;

        System.out.println("O consumo médio do veículo foi de: "+ consumo);
    }
}
