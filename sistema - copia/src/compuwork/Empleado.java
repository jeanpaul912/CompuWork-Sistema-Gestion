/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeanp
 */
package compuwork;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String fechaContratacion;
    private String tipoEmpleado;
    private String departamento;

    public Empleado(int idEmpleado, String nombre, String apellido, String fechaContratacion, String tipoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre; 
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.tipoEmpleado = tipoEmpleado;
        this.departamento = "Sin asignar";
    }

    public void asignarDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return "ID: " + idEmpleado + ", Nombre: " + nombre + " " + apellido + 
               ", Tipo: " + tipoEmpleado + ", Departamento: " + departamento;
    }
}