package navegadorInternet;

public class NavegadorAbstract implements Navegadorinterface{
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
}
