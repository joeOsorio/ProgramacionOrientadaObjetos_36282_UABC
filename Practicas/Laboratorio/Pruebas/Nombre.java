public class Nombre {
    public static void main(String[] args) {
        String nombre = "Joshua Osorio Osorio";
        int edad = 22;
        String correo = "joshua.osorio@uabc.edu.mx";
        String matricula = "1293271";
        String comidaFavorita = "Comida Mexicana";
        String hobby = "Leer sobre filosofía y poesía ";
        String carrera = "Ingeniería en Computación";
        String nacimiento = "Tijuana, Baja California";
	
	System.out.println(nombre + " tiene " + edad + " años y su correo es " + correo + ". ");
        System.out.println("Está inscrito con la matrícula " + matricula + ", estudia " + carrera + " y nació en " + nacimiento + ". ");
        System.out.println("Su comida favorita es " + comidaFavorita + " y disfruta " + hobby + ".");
        System.out.println("\n\n\n+--------------------+-----------------------------------+");
        System.out.printf("| %-18s | %-33s | ", "Nombre", nombre);
        System.out.printf("| %-18s | %-33d | ", "Edad", edad);
        System.out.printf("| %-18s | %-33s | ", "Correo", correo);
        System.out.printf("| %-18s | %-33s | ", "Matrícula", matricula);
        System.out.printf("| %-18s | %-33s | ", "Comida Favorita", comidaFavorita);
        System.out.printf("| %-18s | %-33s | ", "Hobby", hobby);
        System.out.printf("| %-18s | %-33s | ", "Carrera", carrera);
        System.out.printf("| %-18s | %-33s | ", "Lugar de Nacimiento", nacimiento);
        System.out.println("+--------------------+-----------------------------------+");
    }
}