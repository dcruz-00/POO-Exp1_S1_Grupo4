package servicio;

import datos.Cliente;
import datos.CuentaCorriente;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioCliente {
    
    private List<Cliente> clientes = new ArrayList<>();
    //ya no es void si no Cliente, para que devuelva los datos a MEIN.
    public Cliente registrarCliente(Scanner scanner) { //se añade scanner a registrar para que pueda ser leído desde el menú

        // Variables.
        //Las ordené según el orden que pide sistema e instrucciones.
        String rut;     
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String domicilio;
        String comuna;
        String telefono;
        String numeroCuenta;

        //se elimina scanner de acá ya que se definió en instancia MEIN

        System.out.println("== REGISTRAR CLIENTE =="); //compacté estas 3 líneas.
        System.out.println("\nAqui empieza el inicio del registro!");
        System.out.println("Porfavor ingrese los siguientes datos:");

        do {
            System.out.println("Por favor ingrese su RUT considerando puntos y guión.):"); //cambié un poco el mensaje
            rut = scanner.nextLine();
            if (rut.length() < 11 || rut.length() > 12) {
                System.out.println("RUT invalido. Debe tener entre 11 y 12 caracteres.");
            }
        } while (rut.length() < 11 || rut.length() > 12);

        System.out.println("\nIngrese su nombre:"); //se compactó todo.
        nombre = scanner.nextLine();

        System.out.println("\nIngrese su apellido paterno:");
        apellidoPaterno = scanner.nextLine();

        System.out.println( "\nIngrese su apellido materno:");
        apellidoMaterno = scanner.nextLine();

        System.out.println("\nIngrese su domicilio:");
        domicilio = scanner.nextLine();

        System.out.println( "\nIngrese su comuna:");
        comuna = scanner.nextLine();

        System.out.println("\nIngrese su telefono:");
        telefono = scanner.nextLine();

        System.out.println("\nIngrese su numero de cuenta:");
        numeroCuenta = scanner.nextLine();

        CuentaCorriente cuenta = new CuentaCorriente(numeroCuenta);
        Cliente nuevoCliente = new Cliente(rut, nombre, apellidoMaterno, apellidoPaterno, domicilio, comuna, telefono, cuenta);
        clientes.add(nuevoCliente);       
       
        System.out.println("Cliente registrado exitosamente!");
        return nuevoCliente;
    }

}
