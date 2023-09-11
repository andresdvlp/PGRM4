package com.tienda.inventario.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalleVenta")
@Data
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
}
