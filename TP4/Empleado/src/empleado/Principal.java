/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author GastonCejas
 */
public class Principal {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan Delospalotes", "Desarrollador", 50000);
        Empleado emp2 = new Empleado("Analia Vaudagna", "Diseñadora");
        Empleado emp3 = new Empleado("Luisana Rodriguez", "Analista");
        Empleado emp4 = new Empleado(4, "Marta Leon", "Gerente", 80000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println();

        System.out.println("Actualizando salario de " + emp1.getNombre());
        emp1.actualizarSalarioPorcentaje(15); // Aumento del 15%
        System.out.println("Nuevo salario: " + emp1);

        System.out.println("Actualizando salario de " + emp2.getNombre());
        emp2.actualizarSalarioPorcentaje(10); // Aumento del 10%
        System.out.println("Nuevo salario: " + emp2);

        System.out.println("Actualizando salario de " + emp3.getNombre());
        emp3.actualizarSalarioFijo(5000); // Aumento fijo de 5000 (CORRECTO ahora)
        System.out.println("Nuevo salario: " + emp3);

        System.out.println("Actualizando salario de " + emp4.getNombre());
        emp4.actualizarSalarioPorcentaje(5); // Aumento del 5%
        System.out.println("Nuevo salario: " + emp4);

        System.out.println();
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
