public class TicketAberto implements TicketEstado{
    private TicketAberto() {
    }
    private static TicketAberto instance = new TicketAberto();
    public static TicketAberto getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ticket Aberto";
    }
}
