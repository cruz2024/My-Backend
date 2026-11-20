package com.getfin.models;

/**
 * Datos mensuales de ingresos y egresos para el gráfico de líneas.
 */
public class FinancieroMensual {
    private String mes;
    private Double ingresos;   // ✅ corregido (antes String)
    private Double egresos;    // ✅ corregido (antes String)

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public Double getIngresos() { return ingresos; }
    public void setIngresos(Double ingresos) { this.ingresos = ingresos; }

    public Double getEgresos() { return egresos; }
    public void setEgresos(Double egresos) { this.egresos = egresos; }
}
