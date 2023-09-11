package com.tienda.inventario.Controllers;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.Entities.Proveedores;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.ModelDTO.ProveedoresDTO;
import com.tienda.inventario.Services.IClienteService;
import com.tienda.inventario.Services.IProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedoresController {
    @Autowired
    private IProveedoresService service;

    @GetMapping("/{id}")
    public ResponseEntity<Proveedores> getProveedorById(@PathVariable Short id) {
        Proveedores proveedores= service.getProveedorById(id);
        return new ResponseEntity<Proveedores>(proveedores, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> createProveedor(@RequestBody ProveedoresDTO proveedoresDTO) {
        return new ResponseEntity<Boolean>(service.createProveedor(proveedoresDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Proveedores>>getProveedor(){
        List<Proveedores> proveedoresList=service.getAllProveedores();
        return ResponseEntity.ok(proveedoresList);
    }
}
