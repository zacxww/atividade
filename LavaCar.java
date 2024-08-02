import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LavaCar {

    private List<Cliente> clientes;
    private List<Servico> servicos;
    private List<Agendamento> agendamentos;

    public LavaCar() {
        clientes = new ArrayList<>();
        servicos = new ArrayList<>();
        agendamentos = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente c) {

        clientes.add(c);
        System.out.println("Cliente cadastrado: \n" + c + "\n");
    }

    public void cadastrarServico(Servico s) {

        servicos.add(s);
        System.out.println("Serviço cadastrado: \n" + s + "\n");
    }

    public void agendarServico(Cliente c, Servico s, LocalDateTime dataHora) {
        Agendamento agendamento = new Agendamento(c, s, dataHora);
        agendamentos.add(agendamento);
        System.out.println("Serviço agendado:  \n" + agendamento +"\n");
    }

    public void listarAgendamentos() {
        System.out.println("Agendamentos: ");
        for (Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
        }
    }
}
