import aparelhotelefonico.Telefoneinterface;
import navegadorInternet.Navegadorinterface;
import reprodutorMusical.ReproducaoInterface;

public class AparelhoCelular  implements ReproducaoInterface, Telefoneinterface, Navegadorinterface {
    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação: ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar() {
        System.out.println("está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("pausada");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println(nome+ " selecionada");
    }
}
