/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;


/**
 *
 * @author GastonCejas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear artistas
        Artista artista1 = new Artista("Frank Sinatra", "Melodico");
        Artista artista2 = new Artista("Pink Floyd", "Rock Experimental");

        // Crear canciones y asignarles artistas
        Cancion cancion1 = new Cancion("My way");
        cancion1.setArtista(artista1);

        Cancion cancion2 = new Cancion("Shine on you Crazy Dimond");
        cancion2.setArtista(artista2);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Reproducir canciones
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
    }
    
}