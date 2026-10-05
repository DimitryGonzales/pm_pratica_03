import java.time.LocalDate;

public class ContatoPessoal extends Contato {
    private LocalDate dataAniversario;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, LocalDate dataAniversario, String parentesco) {
        super(nome, email, telefone);

        this.setDataAniversario(dataAniversario);
        this.setParentesco(parentesco);
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
