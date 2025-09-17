/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;


/**
 *
 * @author GastonCejas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Gaston", "test@test.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("https://www.MundoJAVAexample.com", usuario);
    }
}