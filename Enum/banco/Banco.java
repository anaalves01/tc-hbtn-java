import java.util.*;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias = new ArrayList<Agencia>();

    public Banco() { }

    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco(String nome, ArrayList<Agencia> agencias) {
        this.nome = nome;
        this.agencias = agencias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        Agencia agencia = null;

        for (Agencia a : agencias) {
            if (nomeAgencia.equals(a.getNome())) {
                agencia = a;
                break;
            }
        }

        return agencia;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        
        if (agencia != null) 
            return false;

        agencias.add(new Agencia(nomeAgencia));
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicialTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        
        if (agencia == null) 
            return false;

        agencia.novoCliente(nomeCliente, valorInicialTransacao);
        agencia.adicionarTransacaoCliente(nomeCliente, valorInicialTransacao);

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorInicialTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        
        if (agencia == null) 
            return false;

        agencia.adicionarTransacaoCliente(nomeCliente, valorInicialTransacao);

        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimeTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        
        if (agencia == null) 
            return false;

        for (int i = 0; i < agencia.getClientes().size(); i++) {
            Cliente cliente = agencia.getClientes().get(i);
            System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), i + 1);
            if (imprimeTransacoes) {
                for (int j = 0; j < cliente.getTransacoes().size(); j++) {
                    System.out.printf("  [%d] valor %.2f\n", j + 1, cliente.getTransacoes().get(j));
                }
            }
        }

        return true;
    }
    
}
