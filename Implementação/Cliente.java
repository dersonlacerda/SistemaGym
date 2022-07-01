import java.util.Date;
public class Cliente extends Usuario{
    public int matricula;
    public String status;
    public String plano;

    public Cliente(String nome, Date datanasc, String rg, String cpf, String sexo, String telefone, String celular,
            String email, String endereco, String senha, String plano) {
        super(nome, datanasc, rg, cpf, sexo, telefone, celular, email, endereco, senha);
        this.plano = plano;
    }
    public Cliente(String senha, String plano) {
        super(senha);
        this.plano = plano;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getStatus() {
        return status;
    }
    public String getPlano() {
        return plano;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
}