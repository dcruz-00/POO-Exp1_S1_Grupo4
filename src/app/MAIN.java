package app;

import datos.Cliente;
import servicio.ServicioCliente;
import java.util.Scanner;

public class MAIN {

    private final Scanner scanner = new Scanner(System.in);
    private final ServicioCliente servicio = new ServicioCliente();
    // 'null' para indicar que esta variable de referencia no tiene un objeto asignado aún. 
    private Cliente cliente = null;

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
                        cliente = servicio.registrarCliente(scanner);
                    case 2 -> {
                        if (cliente != null) {
                            cliente.mostrarDatos();
                        } else {
                            System.out.println("Primero se debe registrar un cliente.");
                        }
                    }
                    case 3 -> {
                        if (cliente != null) {
                            servicio.realizarDeposito(cliente, scanner);
                        } else {
                            System.out.println("Primero se debe registrar un cliente.");
                        }
                    }
                    case 4 -> {
                        if (cliente != null) {
                            servicio.realizarGiro(cliente, scanner);
                        } else {
                            System.out.println("Primero se debe registrar un cliente.");
                        }
                    }
                    case 5 -> {
                        if (cliente != null) {
                            System.out.println("Su saldo actual es: $" + cliente.getCuenta().getSaldo());
                        } else {
                            System.out.println("Primero se debe registrar un cliente.");
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
