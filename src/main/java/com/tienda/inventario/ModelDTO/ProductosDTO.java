package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.DetalleVenta;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ProductosDTO {
    private String nombreProducto;
    private String descripcion;
    private Double precioUnitario;
    private Short cantidadStock;
    private List<DetalleVenta> detallesVentaProducto;

}
