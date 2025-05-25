package app;

import datos.Cliente;
import servicio.ServicioCliente;
import java.util.Scanner;

public class MAIN {

    private final Scanner scanner = new Scanner(System.in);
    private final ServicioCliente servicio = new ServicioCliente();

    public static void main(String[] args) {
        MAIN app = new MAIN();
        app.ejecutarMenu();
    }

    private void ejecutarMenu() {
        int opcionMenu = 0;
        System.out.println("..:: Bienvenido al Banco: BANK BOSTON ::..");

        do {
            mostrarMenu();

            if (scanner.hasNextInt()) {
                opcionMenu = scanner.nextInt();
                scanner.nextLine();

                switch (opcionMenu) {
                    case 1 ->
                        servicio.registrarCliente(scanner);
                    case 2 -> {
                        System.out.println("Por favor ingrese su RUT:");
                        String rut = scanner.nextLine();
                        Cliente clienteEncontrado = servicio.buscarClientePorRut(rut);

                        if (clienteEncontrado != null) {
                            clienteEncontrado.mostrarDatos();
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    }
                    case 3 -> {
                        System.out.println("Por favor ingrese su RUT:");
                        String rut = scanner.nextLine();
                        Cliente clienteEncontrado = servicio.buscarClientePorRut(rut);

                        if (clienteEncontrado != null) {
                            servicio.realizarDeposito(clienteEncontrado, scanner);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Por favor ingrese su RUT:");
                        String rut = scanner.nextLine();
                        Cliente clienteEncontrado = servicio.buscarClientePorRut(rut);

                        if (clienteEncontrado != null) {
                            servicio.realizarGiro(clienteEncontrado, scanner);
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    }
                    case 5 -> {
                        System.out.println("Por favor ingrese su RUT:");
                        String rut = scanner.nextLine();
                        Cliente clienteEncontrado = servicio.buscarClientePorRut(rut);

                        if (clienteEncontrado != null) {
                            System.out.println("Su saldo actual es: $" + clienteEncontrado.getCuenta().getSaldo());
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                    }
                    case 6 ->
                        System.out.println(">> Saliendo del sistema...");
                    default ->
                        System.out.println("Opcion no valida. Intente nuevamente.");
                }
            } else {
                System.out.println("!! Entrada invalida. Ingrese un numero.");
                scanner.nextLine();
            }

        } while (opcionMenu != 6);
    }

    private void mostrarMenu() {
        System.out.println("\n === MENU PRINCIPAL ===");
        System.out.println("--------------------------------");
        System.out.println("1) Registrar cliente");
        System.out.println("2) Ver datos de cliente");
        System.out.println("3) Depositar");
        System.out.println("4) Girar");
        System.out.println("5) Consultar saldo");
        System.out.println("6) Salir");
        System.out.println("--------------------------------");
        System.out.println("> Seleccione una opcion: ");
    }
}
