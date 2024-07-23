package list;

public class Tarefa {
    //states
    private String descaricao;

    public Tarefa(String descaricao) {
        this.descaricao = descaricao;
    }

    public String getDescaricao() {
        return descaricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descaricao='" + descaricao + '\'' +
                '}';
    }
}
