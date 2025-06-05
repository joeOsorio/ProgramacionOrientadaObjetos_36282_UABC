
public class Alumno {

    private int matricula;
    private String nombre;
    private String carrera;
    private int semestre;

    private Materia[] listaCursos;

    private int maxMaterias;

    private int contador;

    public Alumno(int matricula,
            String nombre,
            int maxMaterias) {

        this.matricula
                = matricula;

        this.nombre
                = nombre;

        this.maxMaterias
                = maxMaterias;

        this.listaCursos
                = new Materia[maxMaterias];

        this.contador
                = 0;

    }

    public void setMatricula(int matricula) {
        this.matricula
                = matricula;

    }

    public void setNombre(String nombre) {
        this.nombre
                = nombre;

    }

    public void setCarrera(String carrera) {
        this.carrera
                = carrera;

    }

    public void setSemestre(int semestre) {
        this.semestre
                = semestre;

    }

    public int getMatricula() {
        return matricula;

    }

    public String getNombre() {
        return nombre;

    }

    public String getCarrera() {
        return carrera;

    }

    public int getSemestre() {
        return semestre;

    }
//metodo para asociar un curso con el Alumno

    public void agregarCurso(Materia materia) {

        if (contador
                < maxMaterias) {

            listaCursos[contador]
                    = materia;

            contador++;

        } else {

            System.out
                    .println("Maximo de alcanzados");
        }

    }

    public void imprimeCursos() {

        System.out.println("Cursos de" + nombre + ":");

        for (int i = 0; i < contador; i++) {
            Materia materia
                    = listaCursos[i];

            System.out.println("Clave:" + materia.getClave() + ", Nombre:" + materia
                    .getNombre());
        }

    }
}
