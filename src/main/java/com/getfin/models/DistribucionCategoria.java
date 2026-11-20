package com.getfin.models;

/**
 * Representa la distribución de ingresos por categoría
 * para el gráfico circular del Dashboard.
 */
public class DistribucionCategoria {
    private String categoria;
    private Double monto;

    // Getters y Setters
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
}
