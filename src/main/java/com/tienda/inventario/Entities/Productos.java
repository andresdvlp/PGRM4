package com.tienda.inventario.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "producto")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idProducto;
    private String nombreProducto;
    private String descripcion;
    private Double precioUnitario;
    private Short cantidadStock;
    @OneToMany(mappedBy = "productosDetalle")
    private List<DetalleVenta> detallesVentaProducto;


    public Short getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Short idProducto) {
        this.idProducto = idProducto;
    }

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
