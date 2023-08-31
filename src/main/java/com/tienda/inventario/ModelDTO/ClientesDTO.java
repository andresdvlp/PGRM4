package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.Ventas;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ClientesDTO {
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private int celularCliente;
    private String correoCliente;

    public ClientesDTO() {
    }
    public ClientesDTO(int idCliente, String nombreCliente, String apellidoCliente, int celularCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celularCliente = celularCliente;
        this.correoCliente = correoCliente;
    }
}
