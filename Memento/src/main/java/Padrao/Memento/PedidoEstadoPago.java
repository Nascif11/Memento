package Padrao.Memento;

public class PedidoEstadoPago extends PedidoEstado {

    private PedidoEstadoPago() {}

    private static PedidoEstadoPago instance =
            new PedidoEstadoPago();

    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Pago";
    }
}