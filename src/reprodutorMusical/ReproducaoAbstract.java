package reprodutorMusical;

public class ReproducaoAbstract implements  ReproducaoInterface{
    private final String nome;

    public ReproducaoAbstract(String nome) {
        this.nome = nome;
    }

    @Override
    public void tocar() {
        System.out.println(nome +"está tocando");
    }

    @Override
    public void pausar() {
        System.out.println(nome +"pausada");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println(nome +"selecionada");
    }

    public String getNome() {
        return nome;
    }
}
