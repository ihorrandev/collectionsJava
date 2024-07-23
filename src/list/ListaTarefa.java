package list;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefalist;

    //construtor
    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemove = new ArrayList<>();
        for(Tarefa t : tarefalist){
            if(t.getDescaricao().equalsIgnoreCase(descricao)){
                tarefasRemove.add(t);
            }
        }

        tarefalist.removeAll(tarefasRemove);
    }


    public int obterTarefasTamanho(){

        return tarefalist.size(); //metodo que retorna um inteiro
    }

    public void obterTarefas(){
        System.out.println(tarefalist);
    }


    //O metodo é static justamente pra n colocar o new quando fosse instanciar.
    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterTarefasTamanho());
        listaTarefa.adicionarTarefa("Tarefa 1: plantar batata");
        listaTarefa.adicionarTarefa("Tarefa 2: plantar feijao");
        System.out.println(listaTarefa.obterTarefasTamanho());
        listaTarefa.removerTarefa("Tarefa 2: plantar feijao");
        System.out.println(listaTarefa.obterTarefasTamanho());
        listaTarefa.adicionarTarefa("Tarefa 2: plantar feijao");
        listaTarefa.adicionarTarefa("Tarefa 2: plantar feijao");
        System.out.println(listaTarefa.obterTarefasTamanho());
        listaTarefa.removerTarefa("Tarefa 2: plantar feijao");
        System.out.println(listaTarefa.obterTarefasTamanho());
        listaTarefa.obterTarefas();

    }
}
