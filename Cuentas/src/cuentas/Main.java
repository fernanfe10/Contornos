package cuentas;
/**
 * Clase Principal
 * 
 * 
 * 
 * @author Fernán Fernández Diez
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativaCuenta(cuenta1,1000);
    }

    public static void operativaCuenta(CCuenta cuenta, float cantidad) {
    double saldoActual;

    saldoActual = cuenta.estado();
    System.out.println("El saldo actual es: " + saldoActual );

    try {
        cuenta.retirar(cantidad);
    } catch (Exception e) {
        System.out.println("Fallo al retirar");
    }

    try {
        System.out.println("Ingreso en cuenta");
        cuenta.ingresar(cantidad);
    } catch (Exception e) {
        System.out.println("Fallo al ingresar");
    }
}
}

