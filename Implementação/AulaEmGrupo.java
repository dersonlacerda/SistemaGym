import java.util.Calendar;
import java.util.Date;
public class AulaEmGrupo{
    public String nome;
    public String sala;
    public Date horaInicio;
    public Date horaFim;
    public Instrutor instrutor;
    public Calendar dias;
    public AulaEmGrupo(String nome, String sala, Date horaInicio, Date horaFim, Instrutor instrutor, Calendar dias) {
        this.nome = nome;
        this.sala = sala;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.instrutor = instrutor;
        this.dias = dias;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public Date getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(Date horaFim) {
        this.horaFim = horaFim;
    }
    public Instrutor getInstrutor() {
        return instrutor;
    }
    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    public Calendar getDias() {
        return dias;
    }
    public void setDias(Calendar dias) {
        this.dias = dias;
    }
    protected void finalize() throws Throwable {
        super.finalize();
    }



}