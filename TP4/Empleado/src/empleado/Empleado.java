/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author GastonCejas
 */
public class Empleado {
    private int id;
    private static java.util.HashSet<Integer> idsUsados = new java.util.HashSet<>();
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static final double SALARIO_POR_DEFECTO = 30000.0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        asignarIdSeguro(id);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        int nuevoId = generarNuevoId();
        asignarIdSeguro(nuevoId);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO;
        totalEmpleados++;
    }

    public int getId() { return id; }

    private void asignarIdSeguro(int id) {
        if (idsUsados.contains(id)) {
            throw new IllegalArgumentException("El id " + id + " ya está en uso");
        }
        idsUsados.add(id);
        this.id = id;
    }

    private int generarNuevoId() {
        return idsUsados.isEmpty() ? 1 : java.util.Collections.max(idsUsados) + 1;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacío");
        this.nombre = nombre;
    }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) {
        if (puesto == null || puesto.trim().isEmpty()) throw new IllegalArgumentException("El puesto no puede ser vacío");
        this.puesto = puesto;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) {
        if (salario < 0) throw new IllegalArgumentException("El salario no puede ser negativo");
        this.salario = salario;
    }

    /** Aumento por porcentaje (ej. 10 => 10%) */
    public double actualizarSalarioPorcentaje(double porcentajeAumento) {
        if (porcentajeAumento <= 0) throw new IllegalArgumentException("El porcentaje debe ser mayor que 0");
        salario += salario * (porcentajeAumento / 100.0);
        return salario;
    }

    /** Aumento por monto fijo (ej. 5000 => suma 5000 al salario) */
    public double actualizarSalarioFijo(double montoFijo) {
        if (montoFijo <= 0) throw new IllegalArgumentException("El monto fijo debe ser mayor que 0");
        salario += montoFijo;
        return salario;
    }

    @Override
    public String toString() {
        return String.format("Empleado{id=%d, nombre=%s, puesto=%s, salario=%.2f}", id, nombre, puesto, salario);
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
