
/**
 * Clase Orden (Composición con productos)
 */
class Orden {

    private int id;
    private Cliente cliente;
    private Empleado empleado;
    private List<ItemOrden> items;
    private String estado;
    private Date fecha;
    private static int contadorId = 1;

    public Orden(Cliente cliente, Empleado empleado) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.empleado = empleado;
        this.items = new ArrayList<>();
        this.estado = "Pendiente";
        this.fecha = new Date();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<ItemOrden> getItems() {
        return items;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void agregarItem(Producto producto, int cantidad) {
        if (producto.estaDisponible()) {
            items.add(new ItemOrden(producto, cantidad));
        } else {
            System.out.println("Producto " + producto.getNombre() + " no está disponible");
        }
    }

    public void eliminarItem(int indice) {
        if (indice >= 0 && indice < items.size()) {
            items.remove(indice);
        }
    }

    public double calcularTotal() {
        return items.stream().mapToDouble(ItemOrden::calcularSubtotal).sum();
    }

    public void procesarOrden() {
        if (!items.isEmpty()) {
            empleado.atenderOrden(this);
            cliente.incrementarOrdenes();
            estado = "En proceso";
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ORDEN #").append(id).append(" ===\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Empleado: ").append(empleado.getNombre()).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Items:\n");
        for (ItemOrden item : items) {
            sb.append("  - ").append(item).append("\n");
        }
        sb.append("TOTAL: $").append(String.format("%.2f", calcularTotal()));
        return sb.toString();
    }
}
