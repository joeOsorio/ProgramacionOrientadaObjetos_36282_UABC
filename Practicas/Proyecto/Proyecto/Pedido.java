import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numPedido;
    private Cliente cliente;
    private List<Articulo> articulos;
    private Empresa empresa;
    private Cajero cajero;

    public Pedido(int numPedido, Cliente cliente, Empresa empresa, Cajero cajero) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.empresa = empresa;
        this.cajero = cajero;
    }

    // getters
    public int getNumPedido() {
        return numPedido;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public double calcularTotal() {
        return articulos.stream().mapToDouble(Articulo::getPrecio).sum();
    }

    public void agregarArticulo(Articulo articulo) {
        if (articulo.getDisponible() > 0) {
            articulos.add(articulo);
            articulo.setDisponible(articulo.getDisponible() - 1);
        } else {
            System.out.println("'"+ articulo.getArticulo() +"' - No cumple con la promesa HNR.");
        }
    }

    public String toString() {
        String ticket = "\n" +
                        "          Telefono: " + empresa.getTelefono() + "\n" +
                        "    " + empresa.getCiudad() + "\n" +
                        " GNH ADMINISTRADORA RESTAURANTERA SA DE CV\n" +
                        "                #" + empresa.getCcp() + "\n\n" +
                        "            Cajero: " + cajero.getNombres() + "\n" +
                        "Articulo y Precio               Dispoibles\n" +
                        "------------------------------------------\n";
        for (Articulo articulo : articulos) {
            ticket += articulo.toString() + "\n";
        }
        ticket +=   "------------------------------------------\n";
        ticket += "TOTAL                               $"+ calcularTotal() +"\n";
        return ticket;
    }
}