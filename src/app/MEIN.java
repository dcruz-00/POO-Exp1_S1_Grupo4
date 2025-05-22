package app;

import datos.Cliente;
import servicio.ServicioCliente;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MEIN {

    private Scanner scanner = new Scanner(System.in);
    private ServicioCliente servicio = new ServicioCliente();
    private Cliente datos;

    public static void main(String[] args) {
        MEIN app = new MEIN();
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
                        datos = servicio.registrarCliente(scanner);
                    case 2 -> {
                        if (datos != null) {
                            datos.mostrarDatos();
                        } else {
                            System.out.println("Primero se debe registrar un cliente.");
                        }
                    }
                    case 3 ->  
                        System.out.println("depositar");//integrar a menu
                    case 4 -> 
                        System.out.println("girar");//integrar a menu
                    case 5 ->
                        System.out.println("consultar saldo");//integrar a menu
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
