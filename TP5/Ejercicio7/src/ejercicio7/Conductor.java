/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;


/**
 *
 * @author GastonCejas
 */
public class Conductor {
	private String nombre;
	private String licencia;
	private Vehiculo vehiculo;

	public Conductor(String nombre, String licencia) {
		this.nombre = nombre;
		this.licencia = licencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	// Asociación bidireccional
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		if (vehiculo != null && vehiculo.getConductor() != this) {
			vehiculo.setConductor(this);
		}
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Conductor{" + "nombre='" + nombre + '\'' + ", licencia='" + licencia + '\'' + '}';
	}
}