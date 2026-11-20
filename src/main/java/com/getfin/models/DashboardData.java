package com.getfin.models;

import java.util.List;

/**
 * Datos generales del Dashboard Principal.
 * Se envían al frontend para mostrar tarjetas y gráficos.
 */
public class DashboardData {
    private Double totalIngresos;
    private Double totalEgresos;
    private Double utilidadNeta;
    private Integer animales;
    private Integer cultivosActivos;
    private Integer estudiantesMes;
    private List<FinancieroMensual> comportamientoFinanciero;
    private List<DistribucionCategoria> distribucionIngresos;

    // Getters y Setters
    public Double getTotalIngresos() {
        return totalIngresos;
    }
    public void setTotalIngresos(Double totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public Double getTotalEgresos() {
        return totalEgresos;
    }
    public void setTotalEgresos(Double totalEgresos) {
        this.totalEgresos = totalEgresos;
    }

    public Double getUtilidadNeta() {
        return utilidadNeta;
    }
    public void setUtilidadNeta(Double utilidadNeta) {
        this.utilidadNeta = utilidadNeta;
    }

    public Integer getAnimales() {
        return animales;
    }
    public void setAnimales(Integer animales) {
        this.animales = animales;
    }

    public Integer getCultivosActivos() {
        return cultivosActivos;
    }
    public void setCultivosActivos(Integer cultivosActivos) {
        this.cultivosActivos = cultivosActivos;
    }

    public Integer getEstudiantesMes() {
        return estudiantesMes;
    }
    public void setEstudiantesMes(Integer estudiantesMes) {
        this.estudiantesMes = estudiantesMes;
    }

    public List<FinancieroMensual> getComportamientoFinanciero() {
        return comportamientoFinanciero;
    }
    public void setComportamientoFinanciero(List<FinancieroMensual> comportamientoFinanciero) {
        this.comportamientoFinanciero = comportamientoFinanciero;
    }

    public List<DistribucionCategoria> getDistribucionIngresos() {
        return distribucionIngresos;
    }
    public void setDistribucionIngresos(List<DistribucionCategoria> distribucionIngresos) {
        this.distribucionIngresos = distribucionIngresos;
    }
}
