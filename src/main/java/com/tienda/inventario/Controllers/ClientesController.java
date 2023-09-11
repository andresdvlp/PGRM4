package com.tienda.inventario.Controllers;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.Services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private IClienteService service;

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> getClienteById(@PathVariable int id) {
        Clientes cliente= service.getClienteById(id);
        return new ResponseEntity<Clientes>(cliente,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Boolean> createCliente(@RequestBody ClientesDTO clientesDTO) {
        return new ResponseEntity<Boolean>(service.createCliente(clientesDTO), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Clientes>>getClientes(){
        List<Clientes> clientesList=service.getAllClientes();
        return ResponseEntity.ok(clientesList);
    }
}
