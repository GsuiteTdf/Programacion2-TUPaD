/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author GastonCejas
 */


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Mantener el libro creado con los datos originales
        Libro libro = new Libro("Ensayo sobre la ceguera", "José Saramago", 1995);

        // Mostrar información inicial
        System.out.println(libro.getDescripcion());

        // Darle al usuario la posibilidad de ingresar un valor numérico para el año
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el año de publicación que desea asignar al libro: ");
        String entrada = scanner.nextLine().trim();

        try {
            int anioIngresado = Integer.parseInt(entrada);
            // Llamamos al setter que validará y mostrará el mensaje correspondiente
            libro.setAnioPublicacion(anioIngresado);
        } catch (NumberFormatException e) {
            // Si la entrada no es numérica informamos al usuario (esto no es parte de la regla 1995)
            System.out.println("Entrada inválida. Debe ingresar un número entero.");
        }

        // Mostrar información final (puede haber cambiado a 1995 si se ingresó 1995)
        System.out.println(libro.getDescripcion());

        scanner.close();
    }
}