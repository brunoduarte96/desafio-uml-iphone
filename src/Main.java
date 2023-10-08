
public class Main {
    public static void main(String[] args) {

        AparelhoCelular aparelho = new  AparelhoCelular();

        aparelho.selecionarMusica("Dias de luta, Dias de gloria");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(40028922);

        System.out.println();
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();


        }
    }
