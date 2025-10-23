/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;


/**
 *
 * @author GastonCejas
 */
public class Libro {
    private final String isbn;
    private final String titulo;
    private final int anioPublicacion;
    private final Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public void mostrarInfo() {
        System.out.print("ISBN: " + isbn + " | Título: " + titulo + 
                        " | Año: " + anioPublicacion + " | Autor: " + autor.getNombre());
        System.out.println(" (" + autor.getNacionalidad() + ")");
    }
    
    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }
}