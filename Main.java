import java.time.LocalDateTime;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        LavaCar lavaCar = new LavaCar();

        Cliente c1 = new Cliente("Lucas", "41995473757");
        Cliente c2 = new Cliente("Carol", "41999999996");

        lavaCar.cadastrarCliente(c1);
        lavaCar.cadastrarCliente(c2);

        Servico s1 = new Servico("Descrição1", 10);
        Servico s2 = new Servico("Descrição99", 49.99);

        lavaCar.cadastrarServico(s1);
        lavaCar.cadastrarServico(s2);

        lavaCar.agendarServico(c1, s1, LocalDateTime.now().plusDays(1));
        lavaCar.agendarServico(c2,s2,LocalDateTime.now().plusDays(2));

        lavaCar.listarAgendamentos();
    }
}
