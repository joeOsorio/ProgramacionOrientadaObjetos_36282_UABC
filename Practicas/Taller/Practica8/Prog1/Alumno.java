
public class Alumno extends Persona {

    private String matricula;
    private String carrera;
    private int semestre;

    public Alumno(Nombre nombreCompleto, String direccion, int dia, int mes, int anio, String matricula, String carrera, int semestre) {
        super(nombreCompleto, direccion, dia, mes, anio);
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera; 
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
