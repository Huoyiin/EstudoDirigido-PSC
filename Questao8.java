import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, grupoDeRisco;
        String categoria = "Sem resposta";
        
        System.out.print("Digite o seu nome: ");
        String nome = input.next().substring(0, 1).toUpperCase() + input.nextLine().substring(1);

        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();
        System.out.print("Digite o seu grupo de risco: 1, 2 ou 3: ");
        grupoDeRisco = input.nextInt();

        if (idade >= 17 && idade <= 20) {
            if (grupoDeRisco == 1) categoria = "Baixo";
            else if (grupoDeRisco == 2) categoria = "Médio";
            else if (grupoDeRisco == 3) categoria = "Alto";
        } else if (idade >= 21 && idade <= 24) {
            if (grupoDeRisco == 2) categoria = "Baixo";
            else if (grupoDeRisco == 3) categoria = "Médio";
            else if (grupoDeRisco == 4) categoria = "Alto";
        } else if (idade >= 25 && idade <= 34) {
            if (grupoDeRisco == 3) categoria = "Baixo";
            else if (grupoDeRisco == 4) categoria = "Médio";
            else if (grupoDeRisco == 5) categoria = "Alto";
        } else if (idade >= 35 && idade <= 64) {
            if (grupoDeRisco == 4) categoria = "Médio";
            else if (grupoDeRisco == 5) categoria = "Baixo";
            else if (grupoDeRisco == 6) categoria = "Alto";
        } else if (idade >= 65 && idade <= 70) {
            if (grupoDeRisco == 7) categoria = "Baixo";
            else if (grupoDeRisco == 8) categoria = "Médio";
            else if (grupoDeRisco == 9) categoria = "Alto";
        } else {
            System.out.println("Sua idade não permite o uso deste plano!");
            System.exit(0); 
        }

        System.out.println("Dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco " + grupoDeRisco + ", atribuído à " + nome + " - " + categoria);
    }
}
