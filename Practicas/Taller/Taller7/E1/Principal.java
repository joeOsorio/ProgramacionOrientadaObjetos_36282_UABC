/*-----------------------------------
Practica: 6 Gestión y manipulación de arreglos de objetos en Java.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: Marzo/20/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
Persona persona= new Persona("Jose", "Mendez");
TelefonoMovil telefonoMovil = new TelefonoMovil("6645123434");
persona.setTelefonoMovil(telefonoMovil);

System.out.println(persona.toString());
}
}
