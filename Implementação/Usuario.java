import java.util.Date;
public class Usuario extends Pessoa{

    public String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, Date datanasc, String rg, String cpf, String sexo, String telefone, String celular,
            String email, String endereco, String senha) {
        super(nome, datanasc, rg, cpf, sexo, telefone, celular, email, endereco);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}