package datos;

public class CuentaCorriente {

    private final int numero; 
    private int saldo; 

    public CuentaCorriente(int numeroCuenta) {
        this.numero = numeroCuenta;
        this.saldo = 0; 
    }                                      

    // Getters
    public int getNumeroCuenta() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

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
