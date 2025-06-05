public static void modificarElementoArray(int[] array, Scanner scanner) {
    System.out.print("Ingrese la posición a modificar (0-" + (array.length - 1) + "): ");
    int posicion = scanner.nextInt();
    
    if (posicion >= 0 && posicion < array.length) {
        System.out.print("Ingrese el nuevo valor: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida, ingrese un número entero: ");
            scanner.next();
        }
        array[posicion] = scanner.nextInt();
        System.out.println("Valor actualizado.");
    } else {
        System.out.println("Posición fuera de rango.");
    }
}
