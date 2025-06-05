// Universidad Autonoma de Baja California - Ingenieria en Computacion
// Eduardo Reyes Dominguez Lemus #1291516
// Proyecto final - Programacion Orientada a Objetos
// Prof. Itzel Barriba Cazares

import java.util.Scanner;

public class CaesarVision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // datos de la sucursal por default
        Empresa empresa = new Empresa("Tijuana", "22234", "Sucursal Matamoros", "6642074729");
        Gestor gestor = new Gestor();

        // Menu de articulos
        gestor.getArticulos().add(new Articulo("Classic Pepperoni", 99.0, 5));
        gestor.getArticulos().add(new Articulo("Pizza ExtraExtra ", 109.0, 1));
        gestor.getArticulos().add(new Articulo("Crazy Combo      ", 45.0, 2));
        gestor.getArticulos().add(new Articulo("Refresco 2L      ", 39.0 , 45));
        gestor.getArticulos().add(new Articulo("Refresco 600mL   ", 20.0, 70));
        gestor.getArticulos().add(new Articulo("Aderezo          ", 10.0, 567));
        gestor.getArticulos().add(new Articulo("ICB              ", 65.0, 2));

        System.out.println(" -- Bienvenido a Little Caesars !! --");

        // inicio de sesion
        System.out.println("¿Como desea ingresar?");
        System.out.println("1. Registrarse como cajero");
        System.out.println("2. Invitado");
        System.out.print("Opcion a elegir >> ");
        int opc1 = scanner.nextInt();
        scanner.nextLine();

        Cajero cajero = null;

        if (opc1 == 1) {
            System.out.println("Ingrese los datos para registrarse.");
            System.out.print("Nombre(s): ");
            String nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();
            System.out.print("Direccion: ");
            String direccion = scanner.nextLine();
            System.out.print("Fecha de nacimiento: ");
            String nacimiento = scanner.nextLine();
            System.out.print("Edad: ");
            String edad = scanner.nextLine();
            System.out.print("Numero de empleado: ");
            String numEmpleado = scanner.nextLine();
            System.out.print("Numero de caja: ");
            int numCaja = scanner.nextInt();
            scanner.nextLine();

            cajero = new Cajero(nombre, apellidos, direccion, nacimiento, edad, numEmpleado, numCaja);
        } else {
            System.out.println("Ha ingresado como invitado.");
            cajero = new Cajero();
        }

        boolean salir = false;

        // Menu principal
        while (!salir) {
            System.out.println("\n-- Menu inicial --");
            System.out.println("1. Nuevo cliente (Lobby / Drive-Thru)");
            System.out.println("2. Mostrar artículos");
            System.out.println("3. Modificar menu de articulos");
            System.out.println("4. Hacer un pedido");
            System.out.println("5. Salir");
            System.out.print("Opcion a elegir >> ");
            int opc2 = scanner.nextInt();
            scanner.nextLine();

            switch (opc2) {
                case 1:
                    System.out.println("\n-- Registro del tipo de Cliente --");
                    System.out.println("1. Lobby");
                    System.out.println("2. Drive-Thru");
                    System.out.print("Opcion a elegir >> ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    String tipoCliente;
                    if (tipo == 1) {
                        tipoCliente = "Lobby";
                    }
                    else if (tipo == 2) {
                        tipoCliente = "Drive-Thru";
                    } else {
                        System.out.println("Opcion invalida. Se registrara como Lobby por default.");
                        tipoCliente = "Lobby";
                    }

                    gestor.registrarCliente(tipoCliente);
                    System.out.println("\nCliente registrado exitosamente.\n\nHistorial de clientes:");
                    gestor.listarClientes();
                    break;

                case 2:
                    System.out.println("\n-- Menu de articulos --");
                    gestor.listarArticulos();
                    break;

                case 3:
                    boolean modificar = true;
                    while (modificar) {
                        System.out.println("\n-- Menu de modificaciones --");
                        System.out.println("1. Anadir un nuevo articulo");
                        System.out.println("2. Eliminar articulo");
                        System.out.println("3. Modificar precio de articulo");
                        System.out.println("0. Ninguna de las anteriores");
                        System.out.print("Opcion a elegir >> ");
                        int opc3 = scanner.nextInt();
                        scanner.nextLine();

                        switch (opc3) {
                            case 1:
                                System.out.print("\nNombre del articulo: ");
                                String nomb = scanner.nextLine();
                                System.out.print("Precio del articulo: $");
                                double prec = scanner.nextDouble();
                                System.out.print("Cantidad disponible: ");
                                int cant = scanner.nextInt();
                                scanner.nextLine();

                                gestor.getArticulos().add(new Articulo(nomb, prec, cant));
                                System.out.println("\nArticulo añadido.");
                                break;

                            case 2:
                                System.out.println("\nSeleccione el articulo a eliminar:");
                                gestor.listarArticulos();
                                System.out.print("Articulo a eliminar >> ");
                                int eliminar = scanner.nextInt();
                                scanner.nextLine();

                                if (eliminar > 0 && eliminar <= gestor.getArticulos().size()) {
                                    gestor.getArticulos().remove(eliminar -1);
                                    System.out.println("Articulo eliminado correctamente.");
                                } else {
                                    System.out.println("\nOpcion invalida.");
                                }
                                break;

                            case 3:
                                System.out.println("\nSeleccione el articulo a modificar:");
                                gestor.listarArticulos();
                                System.out.print("Articulo a modificar >> ");
                                int artModificar = scanner.nextInt();
                                scanner.nextLine();

                                if (artModificar > 0 && artModificar <= gestor.getArticulos().size()) {
                                    System.out.print("Nuevo precio: $");
                                    double nPrecio = scanner.nextDouble();
                                    scanner.nextLine();
                                    Articulo articulo = gestor.getArticulos().get(artModificar -1);
                                    articulo.setPrecio(nPrecio);
                                    System.out.println("Precio del articulo modificado exitosamente.");
                                } else {
                                    System.out.println("Valor invalido.");
                                }
                                break;

                            case 0:
                                modificar = false;
                                System.out.println("No se realizaron modificaciones.");
                                break;

                            default:
                                System.out.println("Opcion invalida. Ingrese de nuevo.");
                        }
                    }

                case 4:
                    System.out.println("\n-- Nuevo pedido --");
                    gestor.listarClientes();
                    System.out.print("Numero de cliente:");
                    int numCliente = scanner.nextInt();
                    scanner.nextLine();

                    if (numCliente < 1 || numCliente > gestor.getClientes().size()) {
                        System.out.println("Numero de cliente invalido. Intente de nuevo.");
                        break;
                    }

                    Cliente cliente = gestor.getClientes().get(numCliente - 1);

                    Pedido pedido = new Pedido(gestor.getContadorPedidos() + 1, cliente, empresa, cajero);
                    boolean terminarPedido = false;

                    while (!terminarPedido) {
                        System.out.println("\n-- Menu de articulos --");
                        gestor.listarArticulos();
                        System.out.print(">> ");
                        int articulo = scanner.nextInt();
                        scanner.nextLine();

                        Articulo articuloSeleccionado = gestor.seleccionarArticulo(articulo);

                        if (articuloSeleccionado != null) {
                            System.out.print("Cantidad deseada: ");
                            int cantidad = scanner.nextInt();
                            scanner.nextLine();

                            for (int i = 0; i < cantidad; i++) {
                                pedido.agregarArticulo(articuloSeleccionado);
                            }
                            System.out.println("Articulo agregado al pedido.");
                        } else {
                            System.out.println("Articulo no encontrado.");
                        }

                        System.out.print("\n¿Seguir anadiendo articulos? (s / n): ");
                        String continuar = scanner.nextLine();
                        if (continuar.equalsIgnoreCase("n")) {
                            terminarPedido = true;
                        }
                    }

                    TicketOrden ticket = new TicketOrden(pedido);
                    System.out.println("\n-- Ticket --");
                    System.out.println(ticket.nuevoTicket());
                    break;
                
                case 5:
                    System.out.println("Cerrando sistema.");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}