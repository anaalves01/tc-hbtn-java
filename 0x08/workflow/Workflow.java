import java.util.ArrayList;
import java.util.List;

import atividades.Atividade;

public class Workflow {

    private List<Atividade> workflow = new ArrayList<Atividade>();

    public List<Atividade> getWorkflow() {
        return workflow;
    }

    public void setWorkflow(List<Atividade> workflow) {
        this.workflow = workflow;
    }

    public void registrarAtividade(Atividade atividade) {
        workflow.add(atividade);
    }
    
}
