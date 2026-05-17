package Padrao.Memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveArmazenarEstadosPedido() {

        Pedido pedido = new Pedido();

        pedido.setEstado(PedidoEstadoEmAnalise.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());

        assertEquals(3, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoAtualPedido() {

        Pedido pedido = new Pedido();

        pedido.setEstado(PedidoEstadoEmAnalise.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());

        assertEquals(
                "Pago",
                pedido.getEstado().getNomeEstado()
        );
    }

    @Test
    void deveRestaurarEstadoPedido() {

        Pedido pedido = new Pedido();

        pedido.setEstado(PedidoEstadoEmAnalise.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());

        pedido.restaurarEstado(0);

        assertEquals(
                "Em análise",
                pedido.getEstado().getNomeEstado()
        );
    }

    @Test
    void deveRetornarExcecaoParaIndiceInvalido() {

        try {

            Pedido pedido = new Pedido();

            pedido.restaurarEstado(0);

            fail();

        } catch (IllegalArgumentException e) {

            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
