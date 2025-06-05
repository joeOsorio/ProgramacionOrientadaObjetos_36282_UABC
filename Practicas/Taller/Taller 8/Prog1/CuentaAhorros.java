
public class CuentaAhorros extends CuentaBancaria {

    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        actualizarEstado();
    }

    private void actualizarEstado() {
        activa = saldo >= 10000;
    }

    @Override
    public void depositar(float cantidad) {
        if (activa) {
            super.depositar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se puede depositar.");
        }
        actualizarEstado();
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva. No se puede retirar.");
        }
        actualizarEstado();
    }

    @Override
    public void extractoMensual() {
        if (numRetiros > 4) {
            comisionMensual += (numRetiros - 4) * 1000;
        }
        super.extractoMensual();
        actualizarEstado();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
        System.out.println("Total de transacciones: " + (numConsignaciones + numRetiros));
    }
}
