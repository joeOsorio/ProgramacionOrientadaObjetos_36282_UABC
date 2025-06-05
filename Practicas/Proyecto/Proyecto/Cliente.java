public class Cliente {
    private static int contadorClientes = 1;
    private int numCliente;
    private String tipoCliente;

    public Cliente(String tipoCliente) {
        this.numCliente = contadorClientes++;
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String toString() {
        return "Cliente #"+ numCliente +" - Atendido en: "+ tipoCliente;
    }
}