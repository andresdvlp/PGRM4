package com.tienda.inventario.Services.Impl;

import com.tienda.inventario.Entities.Ventas;
import com.tienda.inventario.ModelDTO.VentasDTO;
import com.tienda.inventario.Repositories.VentaRepository;
import com.tienda.inventario.Services.IVentasService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasImpl implements IVentasService {

    @Autowired
    private VentaRepository ventaRepository;

    private final ModelMapper modelMapper = new ModelMapper();
    @Override
    public boolean createVenta(VentasDTO ventasDTO) {
        try {
            Ventas venta = modelMapper.map(ventasDTO, Ventas.class);
            ventaRepository.save(venta);
            return true;
        }catch (Exception e){
            e.getMessage();
            return false;
        }
    }

    @Override
    public Ventas getVentaById(Integer id) {
        try {
            return ventaRepository.findVentaById(id);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }
    @Override
    public List<Ventas> getAllVentas() {
        return ventaRepository.findAll();
    }
}
