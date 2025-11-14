/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author GastonCejas
 */
public abstract class Animal {

    private final String nombre;

    protected Animal(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String hacerSonido();

    public String describirAnimal() {
        return String.format("Soy un %s llamado %s", getClass().getSimpleName(), nombre);
    }
}