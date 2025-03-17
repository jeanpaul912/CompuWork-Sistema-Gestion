/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeanp
 */
package compuwork;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private List<Empleado> Empleados;

    public Departamento(int idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.Empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        Empleados.add(empleado);
        empleado.asignarDepartamento(this.nombre);
    }

    public List<String> listarEmpleados() {
        List<String> listaEmpleados = new ArrayList<>();
        for (Empleado empleado : Empleados) {
            listaEmpleados.add(empleado.toString());
        }
        return listaEmpleados;
    }

    @Override
    public String toString() {
        return "Departamento: " + nombre + ", Empleados: " + Empleados.size();
    }
}