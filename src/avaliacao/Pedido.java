package avaliacao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {
    private long numero;
    private LocalDateTime pedidoEm;
    private Cliente cliente;
    private Hamburguer hamburguer;
    private boolean temVerduras;
    private boolean temMolho;
    private boolean temQueijo;

    public Pedido(long numero, LocalDateTime pedidoEm, Cliente cliente) {
        this.numero = numero;
        this.pedidoEm = pedidoEm;
        this.cliente = cliente;
    }
    public void selecionarHamburguer(TiposHamburguer tiposHamburguer) {
        if (tiposHamburguer == TiposHamburguer.CARNE) {
            this.hamburguer = Hamburguer.criarHamburgerDeCarne();
        } else if (tiposHamburguer == TiposHamburguer.CARNE) {
            this.hamburguer = Hamburguer.criarHamburgerDeFrango();
        }
    }
    public void adicionarAcompanhamentos(boolean queroVerduras, boolean queroMolho, boolean queroQueijo) {
        this.temMolho = queroMolho;
        this.temQueijo = queroQueijo;
        this.temVerduras = queroVerduras;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", pedidoEm=" + pedidoEm +
                ", cliente=" + cliente +
                ", hamburguer=" + hamburguer +
                ", temVerduras=" + temVerduras +
                ", temMolho=" + temMolho +
                ", temQueijo=" + temQueijo +
                '}';
    }
}
