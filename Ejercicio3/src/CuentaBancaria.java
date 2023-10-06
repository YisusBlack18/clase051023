public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        setSaldo(saldoInicial); 
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que cero.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        cuenta.mostrarInformacion();

        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(-50); 

        cuenta.mostrarInformacion();
    }
}
