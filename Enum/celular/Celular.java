import java.util.*;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public Celular() { }

    public Celular(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int obterPosicaoContato(String nomeContato) {
        Contato c = null;

        for (Contato contato : contatos) {
            if (nomeContato.equals(contato.getNome())) {
                c = contato;
                break;
            }
        }

        return contatos.indexOf(c);
    }

    public void adicionarContato(Contato contato) throws Exception {
        int posicao = obterPosicaoContato(contato.getNome());
        
        if (posicao > 0)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");

        contatos.add(contato);
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumeroDeTelefone(), contato.getTipo().name());
        } 
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        int posicao = obterPosicaoContato(contatoAntigo.getNome());

        if (posicao < 0) {
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        } 

        if (posicao > 0) {
            if (!novoContato.getNome().equals(contatos.get(posicao).getNome()))
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        contatos.set(posicao, novoContato); 
    }

    public void removerContato(Contato contato) throws Exception {
        int posicao = obterPosicaoContato(contato.getNome());
        
        if (posicao < 0)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        
        contatos.remove(posicao);
    }
    
}
