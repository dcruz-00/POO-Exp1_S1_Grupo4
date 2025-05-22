package datos;

public class Cliente {
    private String rut; //pasé todo a private
    private String nombre;//estaban todas las variables ok
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String domicilio;
    private String comuna;
    private String telefono;
    private CuentaCorriente cuenta;
    
//constructor, lo hice de nuevo para validad que estuviera todo ok, pero debería ser lo mismo

public Cliente(String rut, String nombre, String apellidoMaterno, String apellidoPaterno, String domicilio, String comuna, String telefono, CuentaCorriente cuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }



//getters y setters, al final solo pueden ponerse getters, 
    //pero si deseamos que los datos puedan cambiar, les ponemos setters en esta sección tambien.

    public String getRut() { //lo podemos dejar así, que sería lo "correcto"(?)
         return rut;
    }
    
    public String getNombre() { return nombre; } //pero con este formato queda todo más compato y+
                                                 //+legible por ahora.
    public String getApellidoMaterno() { return apellidoMaterno; }

    public String getApellidoPaterno() { return apellidoPaterno; }

    public String getDomicilio() { return domicilio; }

    public String getComuna() { return comuna; }

    public String getTelefono() { return telefono; }

    public CuentaCorriente getCuenta() { return cuenta; }

    public void setRut(String rut) { this.rut = rut; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }

    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public void setComuna(String comuna) { this.comuna = comuna; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public void setCuenta(CuentaCorriente cuenta) { this.cuenta = cuenta; }
       
    
    public void mostrarDatos() { //se agregaron líneas para mostrar la información+
                                   //+tal piden las instrucciones.
        
        System.out.println("RUT: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + apellidoPaterno);
        System.out.println("Apellido materno: " + apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Número de cuenta corriente: ");//completar con get
        System.out.println("Saldo: "); //completar con get
    }
}