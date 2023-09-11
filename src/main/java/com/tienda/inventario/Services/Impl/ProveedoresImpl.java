package com.tienda.inventario.Services.Impl;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.Proveedores;
import com.tienda.inventario.ModelDTO.ProveedoresDTO;
import com.tienda.inventario.Repositories.ProveedorRepository;
import com.tienda.inventario.Services.IProveedoresService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresImpl implements IProveedoresService {

    @Autowired
    private ProveedorRepository proveedorRepository;
    private static ModelMapper modelMapper;
    @Override
    public List<Proveedores> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedores getProveedorById(Short Id) {
        try {
            return proveedorRepository.findByIdProveedor(Id);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }

    @Override
    public boolean createProveedor(ProveedoresDTO proveedoresDTO) {
        boolean isCreated=false;
        try {
            Proveedores proveedores  = modelMapper.map(proveedoresDTO, Proveedores.class);
            proveedorRepository.save(proveedores);
            isCreated=true;
        }catch (Exception e){
            e.getMessage();
        }
        return isCreated;
    }

    @Override
    public boolean deleteProveedor(Short id) {
        try {
            proveedorRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            ex.getMessage();
            return false;
        }
    }
}
