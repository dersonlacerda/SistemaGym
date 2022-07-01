import java.util.Date;
public class Pessoa{
	private static long id;
	private String nome;
	private Date datanasc;
	private String rg;
	private String cpf;
	private String sexo;
	private String telefone;
	private String celular;
	private String email;
	private String endereco;

	private static void contador(){
		id = id++;
	}

	public Pessoa(){
		contador();
	}




	public Pessoa(String nome, Date datanasc, String rg, String cpf, String sexo, String telefone, String celular,
			String email, String endereco) {
		this.nome = nome;
		this.datanasc = datanasc;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.endereco = endereco;
	}

	public static long getId() {
		return id;
	}

	public static void setId(long id) {
		Pessoa.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


}