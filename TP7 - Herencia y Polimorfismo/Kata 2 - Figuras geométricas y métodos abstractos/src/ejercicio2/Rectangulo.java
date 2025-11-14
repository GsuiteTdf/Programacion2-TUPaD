/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;


/**
 *
 * @author GastonCejas
 */
public class Rectangulo extends Figura {

    private final double ancho;
    private final double alto;

    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Ancho y alto deben ser positivos");
        }
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}