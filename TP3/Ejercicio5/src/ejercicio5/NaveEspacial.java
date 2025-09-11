/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author GastonCejas
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private static final double LIMITE_COMBUSTIBLE = 1000.0; // Límite máximo
    private static final double CONSUMO_POR_DISTANCIA = 0.5;  // consumo por unidad de distancia
    private static final double CONSUMO_DESPEGUE = 50.0;     // consumo al despegar

    public NaveEspacial() {
        this.nombre = "Nave sin nombre";
        this.combustible = 0.0;
    }

    public NaveEspacial(String nombre, double combustibleInicial) {
        this.nombre = nombre;
        setCombustible(combustibleInicial);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= LIMITE_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            System.out.println("Cantidad de combustible inválida. Debe estar entre 0 y " + LIMITE_COMBUSTIBLE);
            // no cambiamos el combustible actual
        }
    }

    public void despegar() {
        if (combustible >= CONSUMO_DESPEGUE) {
            combustible -= CONSUMO_DESPEGUE;
            System.out.println(nombre + " ha despegado. (-" + CONSUMO_DESPEGUE + " unidades)");
        } else {
            System.out.println("No hay suficiente combustible para despegar. Se necesitan " + CONSUMO_DESPEGUE + " unidades.");
        }
    }

    public void avanzar(double distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser mayor a 0.");
            return;
        }
        double consumo = distancia * CONSUMO_POR_DISTANCIA;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. (-" + consumo + " combustible)");
        } else {
            double faltante = consumo - combustible;
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades. Falta " + faltante + " unidades de combustible.");
        }
    }

    /**
     * Recarga la nave. Si la cantidad pedida supera el límite,
     * se recarga parcialmente hasta llegar al límite (comportamiento seguro).
     */
    public void recargarCombustible(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }
        double espacioDisponible = LIMITE_COMBUSTIBLE - combustible;
        if (espacioDisponible <= 0) {
            System.out.println("Tanque ya está lleno (" + LIMITE_COMBUSTIBLE + "). No se puede recargar.");
            return;
        }
        double añadido = Math.min(cantidad, espacioDisponible);
        combustible += añadido;
        System.out.println(nombre + " ha recargado " + añadido + " unidades de combustible."
                + (añadido < cantidad ? " (se alcanzó el límite de " + LIMITE_COMBUSTIBLE + ")" : ""));
    }

    public void mostrarEstado() {
        System.out.printf("Nave: %s, Combustible: %.2f/%.0f%n", nombre, combustible, LIMITE_COMBUSTIBLE);
    }

    // helper conveniente
    public void setInformacionCompleta(String nombre, double combustible) {
        setNombre(nombre);
        setCombustible(combustible);
    }
}
