/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;


/**
 *
 * @author GastonCejas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear cuenta bancaria con clave de seguridad
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 1000.0, "1234", "2024-06-01T10:00:00");

        // Crear un titular
        Titular titular = new Titular("Gaston Cejas", "12345678");
        // Asociar el titular con la cuenta bancaria (y viceversa)
        titular.setCuenta(cuenta);
        // Mostrar la información
        System.out.println(titular);
        System.out.println(cuenta);
        System.out.println(cuenta.getClave());        
    }
    
}