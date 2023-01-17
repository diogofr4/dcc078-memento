public class TicketEmProgresso implements TicketEstado{
    private TicketEmProgresso() {
    }
    private static TicketEmProgresso instance = new TicketEmProgresso();
    public static TicketEmProgresso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ticket em Progresso";
    }
}
