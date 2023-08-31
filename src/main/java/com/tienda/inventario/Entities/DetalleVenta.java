package com.tienda.inventario.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "detalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idDetalleVenta;
    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Productos productosDetalle;
    @ManyToOne
    @JoinColumn(name = "idVenta")
    private Ventas ventasDetalle;

    public Short getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(Short idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Productos getProductosDetalle() {
        return productosDetalle;
    }

    public void setProductosDetalle(Productos productosDetalle) {
        this.productosDetalle = productosDetalle;
    }

    public Ventas getVentasDetalle() {
        return ventasDetalle;
    }

    public void setVentasDetalle(Ventas ventasDetalle) {
        this.ventasDetalle = ventasDetalle;
    }
}
