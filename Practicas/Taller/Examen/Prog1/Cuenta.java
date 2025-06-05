
public class Cuenta {

    private String nombre;
    private String direccion;
    private String tipoCuenta;
    private int telefono;
    private double saldo;

    // private static saldo;
    // private static acumulador;
    // private static LIMITE_Saldo;
    Cuenta(String nombre, String direccion, String tipoCuenta, int telefono, double saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCuenta = tipoCuenta;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    ;
	public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    ;
	
	//Otros metodos
	public void getDetalles() {
        System.out.printf("\n\nInformacion de la cuenta");
        System.out.printf("\n\tNombre del titular:\t%s", nombre);
        System.out.printf("\n\tTipo de cuenta:\t%s", tipoCuenta);
        System.out.printf("\n\tSaldo:\t", saldo);
    }

    public void depositar(double saldoD) {
        if (saldoD > 0 || saldoD % 50 == 0) {
            this.saldo += saldoD;
        }
    }

    public void retirar(double saldoRetiro) {
        if (saldoRetiro % 100 == 0 & saldoRetiro < saldo) {
            saldo -= saldoRetiro;
        } else if (saldoRetiro % 100 != 0) {
            System.out.printf("Ingresa multiplos de 100 para retirar");
        } else {
            System.out.printf("Saldo insuficiente");
        }
    }

    public void retirar(int cantidad) {

        if (cantidad < 0 || cantidad % 100 != 0) {
            System.out.println("Solo puedes retirar multiplos de 100 y mayor a 0");
        } else if (cantidad >= 9000 || acumulador) {
            
        }
    }
}
