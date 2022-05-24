import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        String mensagemNotificacao = video.getArquivo() + " - " + video.getFormato();
        Mensagem mensagem = new Mensagem(mensagemNotificacao, TipoMensagem.LOG);

        for (CanalNotificacao canal : canais) {
            canal.notificar(mensagem);
        }
    }
    
}
