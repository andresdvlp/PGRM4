package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.Productos;
import com.tienda.inventario.Entities.Ventas;
import lombok.Data;

@Data
public class DetalleVentaDTO {
    private Productos productosDetalle;

    private Ventas ventasDetalle;
    private boolean deleted;

}
