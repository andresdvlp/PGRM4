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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVenta;
    private Date fechaVenta;
    private String descripcionVentas;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Clientes clientes;
    private boolean deleted;

    public Ventas() {
    }

    public Ventas(Integer idVenta, Date fechaVenta, String descripcionVentas, Clientes clientes, boolean deleted) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.descripcionVentas = descripcionVentas;
        this.clientes = clientes;
        this.deleted=deleted;
    }
}
