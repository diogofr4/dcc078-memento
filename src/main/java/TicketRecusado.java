public class TicketRecusado implements TicketEstado{
    private TicketRecusado() {
    }
    private static TicketRecusado instance = new TicketRecusado();
    public static TicketRecusado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ticket Recusado";
    }
}
