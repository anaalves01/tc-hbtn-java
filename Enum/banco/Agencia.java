import java.util.*;

public class Agencia {

    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public Agencia() { } 

    public Agencia(String nome, ArrayList<Cliente> clientes) {
        this.nome = nome;
        this.clientes = clientes;
    }

    public Agencia(String nomeAgencia) {
        this.nome = nomeAgencia;
        this.clientes = new ArrayList<>();     
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public boolean novoCliente(String nomeCliente, double valorInicialTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);
        
        if (cliente != null) 
            return false;

        clientes.add(new Cliente(nomeCliente, valorInicialTransacao));
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = buscarCliente(nomeCliente);
        
        if (cliente == null) 
            return false;

        cliente.adicionarTransacao(valorTransacao);
        return true;
    }

    public Cliente buscarCliente(String nomeCliente) {
        Cliente cliente = null;

        for (Cliente c : clientes) {
            if (nomeCliente.equals(c.getNome())) {
                cliente = c;
                break;
            }
        }

        return cliente;
    }

}
