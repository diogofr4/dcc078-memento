import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TicketTest {
    @Test
    void deveArmazenarEstados() {
        Ticket ticket = new Ticket();
        ticket.setEstado(TicketAberto.getInstance());
        ticket.setEstado(TicketConcluido.getInstance());
        assertEquals(2, ticket.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Ticket ticket = new Ticket();
        ticket.setEstado(TicketAberto.getInstance());
        ticket.setEstado(TicketConcluido.getInstance());
        ticket.restauraEstado(0);
        assertEquals(TicketAberto.getInstance(), ticket.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Ticket ticket = new Ticket();
        ticket.setEstado(TicketAberto.getInstance());
        ticket.setEstado(TicketAnalisado.getInstance());
        ticket.setEstado(TicketEmProgresso.getInstance());
        ticket.setEstado(TicketConcluido.getInstance());
        ticket.restauraEstado(2);
        assertEquals(TicketEmProgresso.getInstance(), ticket.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Ticket ticket = new Ticket();
            ticket.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
