public class Empleado {
    private String nombreCompleto;
    private int dia;
    private int mes;
    private int anio;
    private int salarioSemanal;

    // Métodos getter para obtener los atributos del empleado
    public String getNombreCompleto() { return nombreCompleto; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }
    public int getSalarioSemanal() { return salarioSemanal; }
    
    // Método para calcular el salario mensual basado en el salario semanal
    public int getSalarioMensual() { return salarioSemanal * 4; }

    // Métodos setter para modificar los atributos del empleado
    public void setDia(int dia) { this.dia = dia; }
    public void setMes(int mes) { this.mes = mes; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setSalarioSemanal(int salarioSemanal) { this.salarioSemanal = salarioSemanal; }

    public void setNombreCompleto(String nombre1, String nombre2, String apellido1, String apellido2) {
		/*
		- Método para establecer el nombre completo del empleado.
		- Se concatena dinámicamente según los valores proporcionados.
		*/ 
		if (nombre1 != null) { this.nombreCompleto = nombre1 + " "; }
        if (nombre2 != null) { this.nombreCompleto += nombre2 + " "; }
        if (apellido1 != null) { this.nombreCompleto += apellido1 + " "; }
        if (apellido2 != null) { this.nombreCompleto += apellido2; }
        
        // En caso de que no se ingrese ningún nombre ni apellido, se asigna "No capturado".
        if (nombre1 == null && nombre2 == null && apellido1 == null && apellido2 == null) {
            this.nombreCompleto = "No capturado";
        }
    }
}
