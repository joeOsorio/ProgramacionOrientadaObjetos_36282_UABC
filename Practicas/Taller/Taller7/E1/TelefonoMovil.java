public class TelefonoMovil {
private String numero;

public TelefonoMovil(String numero) {
	this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String toString() {
		return "Movil: " + numero;
	}
}