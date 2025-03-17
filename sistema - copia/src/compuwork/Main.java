/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeanp
 */
package compuwork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan", "Perez", "2023-01-01", "Permanente");
        Empleado empleado2 = new Empleado(2, "Ana", "Gomez", "2023-02-01", "Temporal");

        Departamento ventas = new Departamento(1, "Ventas");
        Departamento marketing = new Departamento(2, "Marketing");

        ventas.agregarEmpleado(empleado1);
        marketing.agregarEmpleado(empleado2);

        Map<String, Integer> metricas = new HashMap<>();
        metricas.put("Ventas realizadas", 150000);
        metricas.put("Clientes atendidos", 50);

        ReporteDesempeño reporte = new ReporteDesempeño(empleado1, metricas);
        System.out.println(reporte.generarReporte());

        System.out.println("Empleados en Ventas:");
        for (String emp : ventas.listarEmpleados()) {
            System.out.println(emp);
        }
    }
}
