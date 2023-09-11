package com.tienda.inventario.Services;



import com.tienda.inventario.Entities.Productos;
import com.tienda.inventario.ModelDTO.ProductosDTO;

import java.util.List;

public interface IProductosService {
    Productos getProductoById(Short id);
    List<Productos> getAllProductos();
    boolean createProducto(ProductosDTO productosDTO);
    boolean deleteProducto(Short id);
}
