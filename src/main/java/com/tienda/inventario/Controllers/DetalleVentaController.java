package com.tienda.inventario.Controllers;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.DetalleVenta;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.ModelDTO.DetalleVentaDTO;
import com.tienda.inventario.Services.IClienteService;
import com.tienda.inventario.Services.IDetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalleVenta")
public class DetalleVentaController {
    @Autowired
    private IDetalleVentaService service;

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> getDetalleVentaById(@PathVariable Short id) {
        DetalleVenta detalleVenta= service.getVentaById(id);
        return new ResponseEntity<DetalleVenta>(detalleVenta, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> createDetalleVenta(@RequestBody DetalleVentaDTO detalleVentaDTO) {
        return new ResponseEntity<Boolean>(service.createDetalleVenta(detalleVentaDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DetalleVenta>>getAllDetalleVenta(){
        List<DetalleVenta> detalleVentaList=service.getAllDetalleVentas();
        return ResponseEntity.ok(detalleVentaList);
    }
}
