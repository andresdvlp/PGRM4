package com.tienda.inventario.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "cliente")
@Data
public class Clientes {

    @Id
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private int celularCliente;
    private String correoCliente;

    public Clientes(int idCliente, String nombreCliente, String apellidoCliente, int celularCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celularCliente = celularCliente;
        this.correoCliente = correoCliente;
    }
    public Clientes() {
    }
}
