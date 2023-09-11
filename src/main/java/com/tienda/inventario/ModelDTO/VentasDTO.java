package com.tienda.inventario.ModelDTO;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.DetalleVenta;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class VentasDTO {

    private int idVenta;
    private Date fechaVenta;
    private String descripcionVentas;
    private Clientes clientes;
    public VentasDTO(int idVenta, Date fechaVenta, String descripcionVentas, Clientes clientes) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.descripcionVentas = descripcionVentas;
        this.clientes = clientes;
    }
    public VentasDTO() {
    }
}
