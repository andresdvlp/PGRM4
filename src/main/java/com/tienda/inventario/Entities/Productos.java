package com.tienda.inventario.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idProducto;
    private String nombreProducto;
    private String descripcion;
    private Double precioUnitario;
    private Short cantidadStock;
}
