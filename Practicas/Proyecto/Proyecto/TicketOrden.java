public class TicketOrden {
    private Pedido pedido;

    public TicketOrden(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String nuevoTicket() {
        return "------------- LITTLE CAESARS -------------\n\n"+ pedido.toString() +"------------------------------------------";
    }
}