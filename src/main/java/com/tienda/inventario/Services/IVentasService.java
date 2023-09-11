package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.Ventas;
import com.tienda.inventario.ModelDTO.VentasDTO;

import java.util.List;

public interface IVentasService {
    boolean createVenta(VentasDTO ventasDTO);
    Ventas getVentaById(Integer id);
    List<Ventas> getAllVentas();
}
