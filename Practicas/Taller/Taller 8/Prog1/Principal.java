
public class Principal {

    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros(12000, 12);
        cuenta.depositar(2000);
        cuenta.retirar(1000);
        cuenta.retirar(500);
        cuenta.retirar(300);
        cuenta.retirar(200);
        cuenta.retirar(100);
        cuenta.extractoMensual();
        cuenta.imprimir();
    }
}
