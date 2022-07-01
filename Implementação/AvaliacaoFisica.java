import java.util.Date;

public class AvaliacaoFisica {
    public Cliente cliente;
    public String anamnese;
    public String dobras;
    public String ergonometrico;
    public Date data;
    public AvaliacaoFisica(Cliente cliente, String anamnese, String dobras, String ergonometrico, Date data) {
        this.cliente = cliente;
        this.anamnese = anamnese;
        this.dobras = dobras;
        this.ergonometrico = ergonometrico;
        this.data = data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getAnamnese() {
        return anamnese;
    }
    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }
    public String getDobras() {
        return dobras;
    }
    public void setDobras(String dobras) {
        this.dobras = dobras;
    }
    public String getErgonometrico() {
        return ergonometrico;
    }
    public void setErgonometrico(String ergonometrico) {
        this.ergonometrico = ergonometrico;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Date getData() {
        return data;
    }

}
