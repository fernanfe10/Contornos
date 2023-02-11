package cuentas;
/**
 * Clase CCuenta
 * 
 * Esta clase representa una cuenta corriente en un banco.
 * 
 * @author Fernán Fernández Diez
 * @version 1.0
 */
public class CCuenta {
    
   /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Numero de cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * %Interés de la cuenta
     */
    private double tipoInteres;
/**
     * Constructor para la clase CCuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Interés anual de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }
    /**
     * Metodos de acceso a los diferentes valores.
     * Setters
     * Getters
     * 
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
/**
     * Metodo que verifica que no ingresamos cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
/**
     * Metodo que verifica que no retiramos cantidad negativa y que hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
/**
     * Metodo que devuelve el saldo final
     */
    public double estado() {
        return saldo;
    }
}
