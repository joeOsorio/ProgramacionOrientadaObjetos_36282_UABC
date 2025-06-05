
public class CuentaBancaria {

    protected float saldo;
    protected int numRetiros;
    protected int numConsignaciones;
    protected float tasaAnual;
    protected float comisionMensual;

    public CuentaBancaria(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numRetiros = 0;
        this.numConsignaciones = 0;
        this.comisionMensual = 0;
    }

    public void depositar(float cantidad) {
        saldo += cantidad;
        numConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            numRetiros++;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public float calcularInteresMensual() {
        float interesMensual = (tasaAnual / 12) / 100 * saldo;
        saldo += interesMensual;
        return interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void imprimir() {
        System.out.println("Saldo: $" + saldo);
        System.out.println("Número de Consignaciones: " + numConsignaciones);
        System.out.println("Número de Retiros: " + numRetiros);
        System.out.println("Comisión mensual: $" + comisionMensual);
    }
}
