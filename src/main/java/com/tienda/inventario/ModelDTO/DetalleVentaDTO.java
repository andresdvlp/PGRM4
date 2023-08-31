package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.Productos;
import com.tienda.inventario.Entities.Ventas;
public class DetalleVentaDTO {
    private Productos productosDetalle;

    private Ventas ventasDetalle;

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
