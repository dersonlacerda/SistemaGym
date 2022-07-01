import java.util.Date;

public class Instrutor extends Pessoa {
    public String capacitacao;
    public String atividades;
    public Instrutor(String nome, Date datanasc, String rg, String cpf, String sexo, String telefone, String celular,
            String email, String endereco, String capacitacao, String atividades) {
        super(nome, datanasc, rg, cpf, sexo, telefone, celular, email, endereco);
        this.capacitacao = capacitacao;
        this.atividades = atividades;
    }
    public Instrutor(String capacitacao, String atividades) {
        this.capacitacao = capacitacao;
        this.atividades = atividades;
    }
    public String getCapacitacao() {
        return capacitacao;
    }
    public void setCapacitacao(String capacitacao) {
        this.capacitacao = capacitacao;
    }
    public String getAtividades() {
        return atividades;
    }
    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }
    
}
