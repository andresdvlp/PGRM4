package com.tienda.inventario.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "cliente")
@Data
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;
    private String password;
    private String nombreCliente;
    private String apellidoCliente;
    private int celularCliente;
    private String correoCliente;
    private boolean deleted;

    public Clientes(Long idCliente, String password, String nombreCliente, String apellidoCliente, int celularCliente, String correoCliente, boolean deleted) {
        this.idCliente = idCliente;
        this.password=password;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celularCliente = celularCliente;
        this.correoCliente = correoCliente;
        this.deleted=deleted;
    }
    public Clientes() {
    }
}
