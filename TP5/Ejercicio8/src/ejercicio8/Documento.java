/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;


/**
 *
 * @author GastonCejas
 */
public class Documento {
	private String titulo;
	private String contenido;
	private FirmaDigital firmaDigital; // Composición

	public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
		this.titulo = titulo;
		this.contenido = contenido;
		this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public FirmaDigital getFirmaDigital() {
		return firmaDigital;
	}

	public void setFirmaDigital(FirmaDigital firmaDigital) {
		this.firmaDigital = firmaDigital;
	}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
}