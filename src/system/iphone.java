package system;

public class iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

     // Telefone
     @Override
     public void Tocar() {
          System.out.println("Tocando musica");
     }

     @Override
     public void Pausar() {
          System.out.println("Pausando musica");
     }

     @Override
     public void EscoherMusica(String musica) {
          System.out.println("Escolhendo a musica " + musica);
     }

     // Navegador
     @Override
     public void ExibirPagina(String url) {
          System.out.println("Abrindo uma nova pagina na url" + url);
     }

     @Override
     public void AdicionarNovaAba() {
          System.out.println("Criando nova aba");
     }

     @Override
     public void AtualizarPagina() {
          System.out.println("Atualizando a pagina");
     }

     // Telefone
     @Override
     public void Ligar(String numero) {
          System.out.println("Fazendo uma ligação para o numero " + numero);
     }

     @Override
     public void Atender() {
          System.out.println("Atendendo uma ligação");
     }

     @Override
     public void IniciarCorreioVoz() {
          System.out.println("Deixando mensagem no correio de voz");
     }

}
