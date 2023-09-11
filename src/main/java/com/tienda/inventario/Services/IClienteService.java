package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.ModelDTO.VentasDTO;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    List<Clientes> getAllClientes();
    Clientes getClienteById(int Id);
    boolean createCliente(ClientesDTO clientesDTO);
    boolean deleteCliente(int id);
}
