/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;


/**
 *
 * @author GastonCejas
 */
public class Usuario {
	private final String nombre;
	private final String email;

	public Usuario(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Usuario{" +
				"nombre='" + nombre + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}