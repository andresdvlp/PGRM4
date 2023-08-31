package com.tienda.inventario.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "venta")
@Data
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    private Date fechaVenta;
    private String descripcionVentas;
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes clientes;

    public Ventas() {
    }

    public Ventas(Integer idVenta, Date fechaVenta, String descripcionVentas, Clientes clientes) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.descripcionVentas = descripcionVentas;
        this.clientes = clientes;
    }
}
