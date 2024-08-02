import java.time.LocalDateTime;

public class Agendamento {

    private Cliente c;
    private Servico s;
    private LocalDateTime dataHora;

    public Agendamento(Cliente c, Servico s, LocalDateTime dataHora) {
        this.c = c;
        this. s = s;
        this.dataHora = dataHora;
    }

    public Cliente getC() {
        return c;
    }

    public Servico getS() {
        return s;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String toString() {
        return "Agendamento [Cliente: " + c.getNome() + ", Serviço: " + s.getDescricao() +
                "Data e hora: " + dataHora.toString() + "]";
    }
}
