public class Aluno{
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public double calcularMedia() {
        double media = ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
        return media;
    }

    public double finalNecessaria() {
        double media = calcularMedia();
        double necessaria = 0;
        if (media < 6 && media >= 4) {
            necessaria = (12 - media * 7) / 3;
        } else if (media < 4) {
            necessaria = 5 - media;
        }
        if (necessaria < 0) {
            necessaria = 0;
        }
        return necessaria;
    }
}
