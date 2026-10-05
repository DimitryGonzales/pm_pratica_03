import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;
    private int contatosQuantidade;

    public Agenda() {
        contatos = new ArrayList<Contato>();
        contatosQuantidade = 0;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);

        contatosQuantidade++;
    }

    public void removerContato(Contato contato) {
        if (contatos.contains(contato)) {
            contatos.remove(contato);

            System.out.println("Contato encontrado e removido");
        } else System.out.println("Contato não encontrado");

    }

    public Contato buscarContatoNome(String nome) {
        for (Contato contato : contatos) if (contato.getNome().equals(nome)) return contato;

        return null;
    }

    public Contato buscarContatoEmail(String email) {
        for (Contato contato : contatos) if (contato.getEmail().equals(email)) return contato;

        return null;
    }

    public Contato buscarContatoTelefone(String telefone) {
        for (Contato contato : contatos) if (contato.getTelefone().equals(telefone)) return contato;

        return null;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int getContatosQuantidade() {
        return contatosQuantidade;
    }

    public void setContatosQuantidade(int contatosQuantidade) {
        this.contatosQuantidade = contatosQuantidade;
    }
}
