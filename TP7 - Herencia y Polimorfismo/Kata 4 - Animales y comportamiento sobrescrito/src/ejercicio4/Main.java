/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author GastonCejas
 */
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> granja = List.of(
                new Perro("Firulais"),
                new Gato("Mishi"),
                new Vaca("Lola")
        );

        for (Animal a : granja) {
            System.out.printf("%s -> Sonido: %s%n", a.describirAnimal(), a.hacerSonido());
        }
    }

}