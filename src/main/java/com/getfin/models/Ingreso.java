package com.getfin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank(message = "Campo obligatorio")
    private  String categoria;

    @NotBlank(message = "Campo obligatorio")
    private String producto_servicio;

    @NotNull(message = "Campo obligatorio")
    @Positive(message = "Cantidad mayor a 0")
    private  Double cantidad;

    @NotNull(message = "Campo obligatorio")
    @Positive(message = "Cantidad mayor a 0")
    private  Double monto;

    @NotNull(message = "Campo obligatorio")
    private LocalDate fecha;

    @NotBlank(message = "Campo obligatorio")
    private String descripcion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProducto_servicio() {
        return producto_servicio;
    }

    public void setProducto_servicio(String producto_servicio) {
        this.producto_servicio = producto_servicio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
