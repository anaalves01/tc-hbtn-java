import java.util.*;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ListaTodo() { }

    public ListaTodo(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa t : tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador())
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            
            if (tarefa.getDescricao().equals("") || tarefa.getDescricao().isEmpty() || tarefa.getDescricao().equals(null))
                throw new IllegalArgumentException("Descricao de tarefa invalida");
        }   

        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }

        return false;
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.printf("[X]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            } else {
                System.out.printf("[ ]  Id: %d - Descricao: %s\n", tarefa.getIdentificador(), tarefa.getDescricao());
            }
        } 
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }

        return false;
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

}
