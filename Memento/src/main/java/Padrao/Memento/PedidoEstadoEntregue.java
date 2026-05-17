package Padrao.Memento;

public class PedidoEstadoEntregue extends PedidoEstado {

    private PedidoEstadoEntregue() {}

    private static PedidoEstadoEntregue instance =
            new PedidoEstadoEntregue();

    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}