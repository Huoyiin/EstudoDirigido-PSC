public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Solicitacao solicitacao = new Solicitacao();

        usuario.nome = "Emily";
        usuario.cfp = "100.000.000-00";
        usuario.telefone = "3199237861";
        solicitacao.nomeSolicitante = "Teresa Cristina";
        solicitacao.cpfSolicitante = "000.000.000-80";
        solicitacao.problemaRelatado = "Internet ficando mais lenta";
        solicitacao.solucaoProblema = "Enviar um tecnico na para averiguar o roteador de internet.";

        usuario.cadastrarUsuario();
        usuario.fazerLogin();
        solicitacao.cadatrarSolitacao();
        solicitacao.alterarSolicitacao();
        solicitacao.buscarSolitacao();

    }
}
