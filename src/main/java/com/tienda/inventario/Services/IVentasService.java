package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Ventas;
import com.tienda.inventario.ModelDTO.VentasDTO;

public interface IVentasService {
    boolean createVenta(VentasDTO ventasDTO);
    Ventas getVentaById(Integer id);
}
