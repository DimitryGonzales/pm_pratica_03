public abstract class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public String exibirDados() {
        return "Nome: " + this.getNome() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Telefone: " + this.getTelefone();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
