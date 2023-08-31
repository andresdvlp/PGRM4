package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.DetalleVenta;
import jakarta.persistence.OneToMany;

import java.util.List;

public class ProductosDTO {
    private String nombreProducto;
    private String descripcion;
    private Double precioUnitario;
    private Short cantidadStock;
    private List<DetalleVenta> detallesVentaProducto;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Short getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Short cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public List<DetalleVenta> getDetallesVentaProducto() {
        return detallesVentaProducto;
    }

    public void setDetallesVentaProducto(List<DetalleVenta> detallesVentaProducto) {
        this.detallesVentaProducto = detallesVentaProducto;
    }
}
