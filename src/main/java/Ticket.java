import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private TicketEstado estado;
    private List<TicketEstado> memento = new ArrayList<TicketEstado>();

    public TicketEstado getEstado() {
        return estado;
    }

    public void setEstado(TicketEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<TicketEstado> getEstados() {
        return this.memento;
    }
}
