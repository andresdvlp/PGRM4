package com.tienda.inventario.Controllers;


import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.Ventas;
import com.tienda.inventario.ModelDTO.VentasDTO;
import com.tienda.inventario.Services.IVentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/ventas")
public class VentasController {

    @Autowired
    private IVentasService service;

    @GetMapping("/{id}")
    public ResponseEntity<Ventas> getVentaById(@PathVariable int id) {
        Ventas venta= service.getVentaById(id);
        return new ResponseEntity<Ventas>(venta, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> createVenta(@RequestBody VentasDTO ventasDTO) {
        return new ResponseEntity<Boolean>(service.createVenta(ventasDTO), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Ventas>>getVentas(){
        List<Ventas> ventasList=service.getAllVentas();
        return ResponseEntity.ok(ventasList);
    }
}
