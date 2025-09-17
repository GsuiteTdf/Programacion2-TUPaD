/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;


/**
 *
 * @author GastonCejas
 */
public class Artista {
	private String nombre;
	private String genero;

	public Artista(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Artista{" +
				"nombre='" + nombre + '\'' +
				", genero='" + genero + '\'' +
				'}';
	}
}