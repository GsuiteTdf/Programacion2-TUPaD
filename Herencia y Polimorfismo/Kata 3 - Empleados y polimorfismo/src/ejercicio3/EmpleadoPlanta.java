/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author GastonCejas
 */
public class EmpleadoPlanta extends Empleado {

    private final double salarioBase;
    private final double bono;

    public EmpleadoPlanta(String nombre, double salarioBase, double bono) {
        super(nombre);
        if (salarioBase < 0 || bono < 0) {
            throw new IllegalArgumentException("Valores no pueden ser negativos");
        }
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono;
    }
}