/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;


/**
 *
 * @author GastonCejas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Jorge Rojas", "20-34165141-5");
        Impuesto impuesto = new Impuesto(1750.25);
        impuesto.setContribuyente(contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
    
}