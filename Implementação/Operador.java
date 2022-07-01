import java.util.Date;

public class Operador extends Usuario{
    public String tipo;
    public String login;

    public Operador(String nome, Date datanasc, String rg, String cpf, String sexo, String telefone, String celular,
            String email, String endereco, String senha, String tipo, String login) {
        super(nome, datanasc, rg, cpf, sexo, telefone, celular, email, endereco, senha);
        this.tipo = tipo;
        this.login = login;
    }
    public Operador(String senha, String tipo, String login) {
        super(senha);
        this.tipo = tipo;
        this.login = login;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getRg() {
        return super.getRg();
    }
    public String getCpf() {
        return super.getCpf();
    }
    
}