package com.tienda.inventario.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.logging.Handler;

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
