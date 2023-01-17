public class TicketAnalisado implements TicketEstado{
    private TicketAnalisado() {
    }
    private static TicketAnalisado instance = new TicketAnalisado();
    public static TicketAnalisado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ticket Analisado";
    }
}
