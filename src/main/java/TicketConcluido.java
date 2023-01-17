public class TicketConcluido implements TicketEstado{
    private TicketConcluido() {
    }
    private static TicketConcluido instance = new TicketConcluido();
    public static TicketConcluido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Ticket Concluido";
    }
}
