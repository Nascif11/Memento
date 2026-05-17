package Padrao.Memento;

public class PedidoEstadoCancelado extends PedidoEstado {

    private PedidoEstadoCancelado() {}

    private static PedidoEstadoCancelado instance =
            new PedidoEstadoCancelado();

    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }
}
