package com.tienda.inventario.Services.Impl;

import com.tienda.inventario.Entities.Productos;
import com.tienda.inventario.Entities.Proveedores;
import com.tienda.inventario.ModelDTO.ProductosDTO;
import com.tienda.inventario.Repositories.ProductosRepository;
import com.tienda.inventario.Services.IProductosService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosImpl implements IProductosService {

    @Autowired
    private ProductosRepository productosRepository;
    private static ModelMapper modelMapper;
    @Override
    public List<Productos> getAllProductos() {
        return productosRepository.findAll();
    }

    @Override
    public Productos getProductoById(Short Id) {
        try {
            return productosRepository.findByIdProducto(Id);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }

    @Override
    public boolean createProducto(ProductosDTO productosDTO) {
        boolean isCreated=false;
        try {
            Productos productos  = modelMapper.map(productosDTO, Productos.class);
            productosRepository.save(productos);
            isCreated=true;
        }catch (Exception e){
            e.getMessage();
        }
        return isCreated;
    }

    @Override
    public boolean deleteProducto(Short id) {
        try {
            productosRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            ex.getMessage();
            return false;
        }
    }
}
