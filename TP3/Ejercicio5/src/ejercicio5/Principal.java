/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author GastonCejas
 */
public class Principal {

    public static void main(String[] args) {
        // 1) Crear una nave con 50 unidades de combustible (según la consigna)
        NaveEspacial nave1 = new NaveEspacial("Whisky Romeo Zulu", 50.0);

        // mostrar estado inicial
        nave1.mostrarEstado();

        // 2) Intentar avanzar sin recargar (debe fallar si la distancia requiere más combustible)
        // Elegimos una distancia que requiera más de 50 unidades de combustible; por ejemplo 200 -> consumo 200*0.5 = 100
        System.out.println("\nIntento de avanzar sin recargar:");
        nave1.avanzar(200);

        // mostrar estado tras intento fallido
        nave1.mostrarEstado();

        // 3) Recargar combustible (sin superar el límite). Recargamos 100 (quedará 150).
        System.out.println("\nRecargando combustible:");
        nave1.recargarCombustible(100);

        // mostrar estado tras recarga
        nave1.mostrarEstado();

        // 4) Avanzar correctamente (ahora tenemos suficiente para la distancia 200)
        System.out.println("\nIntento de avanzar nuevamente:");
        nave1.avanzar(200);

        // mostrar estado final
        System.out.println("\nEstado final:");
        nave1.mostrarEstado();
    }
}
