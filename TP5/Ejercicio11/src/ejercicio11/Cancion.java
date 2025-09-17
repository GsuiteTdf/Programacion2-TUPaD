/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;


/**
 *
 * @author GastonCejas
 */
public class Cancion {
	private String titulo;
	private Artista artista; // Asociación unidireccional

	public Cancion(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

    /**
     *
     * @return
     */
    @Override
	public String toString() {
		return "Cancion{" +
				"titulo='" + titulo + '\'' +
				", artista=" + artista +
				'}';
	}
}