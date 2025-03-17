/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeanp
 */
package compuwork;

import java.util.Map;

public class ReporteDesempeño {
    private Empleado Empleado;
    private Map<String, Integer> metricas;

    public ReporteDesempeño(Empleado empleado, Map<String, Integer> metricas) {
        this.Empleado = empleado;
        this.metricas = metricas;
    }

    public String generarReporte() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de Desempeño para ").append(Empleado.getNombre()).append(" ").append(Empleado.getApellido()).append(":\n");
        for (Map.Entry<String, Integer> entry : metricas.entrySet()) {
            reporte.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return reporte.toString();
    }
}
