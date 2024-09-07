import system.iphone;

public class App {
    public static void main(String[] args) throws Exception {
        iphone meuIphone = new iphone();

        // Utilizando funções de telefone
        System.out.println("### Funções de Telefone ###");
        meuIphone.Ligar("21 983294521");
        meuIphone.Atender();
        meuIphone.IniciarCorreioVoz();

        // Utilizando funções de navegador
        System.out.println("\n### Funções de Navegador ###");
        meuIphone.ExibirPagina("https://www.example.com");
        meuIphone.AdicionarNovaAba();
        meuIphone.AtualizarPagina();

        // Utilizando funções de reprodutor musical
        System.out.println("\n### Funções de Reprodutor Musical ###");
        meuIphone.Tocar();
        meuIphone.Pausar();
        meuIphone.EscoherMusica("Bohemian Rhapsody");
    }
}
