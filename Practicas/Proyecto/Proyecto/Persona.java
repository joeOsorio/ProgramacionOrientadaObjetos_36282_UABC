public class Persona {
    private String nombres;
    private String apellidos;
    private String direccion;
    private String nacimiento;
    private String edad;


    // Constructor para el cajero invitado
    public Persona() {
        this.nombres = "Pequeno Cesar";
        this.apellidos = "undefined";
        this.direccion = "undefined";
        this.nacimiento = "undefined";
        this.edad = "undefined";
    }
    public Persona(String nombres, String apellidos, String direccion, String nacimiento, String edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.edad = edad;
    }

    // setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }

    // getters
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getNacimiento() {
        return nacimiento;
    }
    public String getEdad() {
        return edad;
    }
}