/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author GastonCejas
 */
import java.util.List;

public class Main {

    public static void main(String[] args) {
         List<Figura> figuras = List.of(
            new Circulo("Circulo A", 3.0),
            new Rectangulo("Rectangulo B", 4.0, 2.5),
            new Circulo("Circulo C", 1.25)
        );

        for (Figura f : figuras) {
            System.out.printf("%s -> Area: %.4f%n", f.getNombre(), f.calcularArea());
        }
    }
    
}