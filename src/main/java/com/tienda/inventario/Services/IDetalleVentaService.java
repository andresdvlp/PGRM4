package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.DetalleVenta;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.ModelDTO.DetalleVentaDTO;

import java.util.List;

public interface IDetalleVentaService {
    List<DetalleVenta> getAllDetalleVentas();
    DetalleVenta getVentaById(Short id);

    boolean createDetalleVenta(DetalleVentaDTO detalleVentaDTO);
    boolean deleteDetalleVenta(Short id);
}
