public class ContatoEmergencia extends Contato {
    private int grauPrioridade;

    public ContatoEmergencia(String nome, String email, String telefone, int grauPrioridade) {
        super(nome, email, telefone);

        this.setGrauPrioridade(grauPrioridade);
    }

    public int getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(int grauPrioridade) {
        if (grauPrioridade < 1) grauPrioridade = 1;
        else if (grauPrioridade > 5) grauPrioridade = 5;

        this.grauPrioridade = grauPrioridade;
    }
}
