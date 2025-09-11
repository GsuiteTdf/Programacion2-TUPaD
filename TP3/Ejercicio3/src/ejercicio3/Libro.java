/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author GastonCejas
 */

public class Libro {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación según tu requerimiento:
    // acepta y cambia sólo si el año ingresado es 1995; en otro caso imprime el mensaje pedido.
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion == 1995) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año actualizado correctamente.");
        } else {
            System.out.println("Error, el año de publicación de dicha obra es 1995");
        }
    }

    // Método para compatibilidad con tu código anterior
    public String getDescripcion() {
        return toString();
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion;
    }
}
