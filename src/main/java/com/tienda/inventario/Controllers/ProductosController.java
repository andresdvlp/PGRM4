package com.tienda.inventario.Controllers;

import com.tienda.inventario.Entities.Productos;
import com.tienda.inventario.ModelDTO.ProductosDTO;
import com.tienda.inventario.Services.IProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductosController {

    @Autowired
    private IProductosService service;

    @GetMapping("/{id}")
    public ResponseEntity<Productos> getProductoById(@PathVariable Short id) {
        Productos productos= service.getProductoById(id);
        return new ResponseEntity<Productos>(productos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> createProducto(@RequestBody ProductosDTO productosDTO) {
        return new ResponseEntity<Boolean>(service.createProducto(productosDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Productos>>getProducto(){
        List<Productos> productosList=service.getAllProductos();
        return ResponseEntity.ok(productosList);
    }
}
