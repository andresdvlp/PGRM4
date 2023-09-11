package com.tienda.inventario.Services.Impl;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.DetalleVenta;
import com.tienda.inventario.ModelDTO.DetalleVentaDTO;
import com.tienda.inventario.Repositories.DetalleVentaRepository;
import com.tienda.inventario.Services.IDetalleVentaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaImpl implements IDetalleVentaService {


    @Autowired
    private DetalleVentaRepository ventaRepository;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<DetalleVenta> getAllDetalleVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public DetalleVenta getVentaById(Short id) {
        try {
            return ventaRepository.findByIdDetalleVenta(id);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }


    @Override
    public boolean createDetalleVenta(DetalleVentaDTO detalleVentaDTO) {
        boolean isCreated=false;
        try {
            DetalleVenta detalleVenta  = modelMapper.map(detalleVentaDTO, DetalleVenta.class);
            ventaRepository.save(detalleVenta);
            isCreated=true;
        }catch (Exception e){
            e.getMessage();
        }
        return isCreated;
    }

    @Override
    public boolean deleteDetalleVenta(Short id) {
        try {
            ventaRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            ex.getMessage();
            return false;
        }
    }
}
