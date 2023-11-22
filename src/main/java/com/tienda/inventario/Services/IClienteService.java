package com.tienda.inventario.Services;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.ModelDTO.ClientesDTO;

import java.util.List;

public interface IClienteService {
    List<Clientes> getAllClientes();
    Clientes getClienteById(Long Id);
    boolean createCliente(ClientesDTO clientesDTO);
    boolean deleteCliente(Long id);
    boolean logicDelete(Long id);
}
