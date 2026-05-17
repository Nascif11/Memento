package Padrao.Memento;

public class PedidoEstadoEmAnalise extends PedidoEstado {

    private PedidoEstadoEmAnalise() {}

    private static PedidoEstadoEmAnalise instance =
            new PedidoEstadoEmAnalise();

    public static PedidoEstadoEmAnalise getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em análise";
    }
}