package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Proveedores;
import com.tienda.inventario.ModelDTO.ProveedoresDTO;

import java.util.List;

public interface IProveedoresService {
    List<Proveedores> getAllProveedores();
    Proveedores getProveedorById(Short Id);

    boolean createProveedor(ProveedoresDTO proveedoresDTO);
    boolean deleteProveedor(Short id);
}
