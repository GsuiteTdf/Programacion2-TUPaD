/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;


/**
 *
 * @author GastonCejas
 */
public class Principal {

    public static void main(String[] args) {
       Auto auto = new Auto("Toyota", "Corolla", 4);
        System.out.println(auto.mostrarInfo());

        Vehiculo v = new Auto("Ford", "Focus", 5);
        System.out.println(v.mostrarInfo());
    }
    
}