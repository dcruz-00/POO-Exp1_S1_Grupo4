package datos;

public class CuentaCorriente { 
    private int numero; //en esta sección estaba casi todo bien, solo puse private en variables.
    private int saldo; //removí el = 0, se añade más abajo.

    public CuentaCorriente(int numeroCuenta) {//añadir if validación
        this.numero = numeroCuenta;
        this.saldo = 0; //se añade = 0 acá //añadí manualmente este this. ya que+ 
    }                                      //+no me lo tiraba el constructor.+
                                           //+después aparece mágicamente en el getter y setter. nice.
    

    public int getNumeroCuenta() { return numero; }
    public int getSaldo() { return saldo; }

    public void depositar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido: debe ser mayor que cero.");
        }
        saldo += monto;
    }

    public void girar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido: debe ser mayor que cero.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= monto;
    }
}
