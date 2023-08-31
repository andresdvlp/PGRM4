package com.tienda.inventario.Services.Impl;

import com.tienda.inventario.Entities.Clientes;
import com.tienda.inventario.ModelDTO.ClientesDTO;
import com.tienda.inventario.Repositories.ClienteRepository;
import com.tienda.inventario.Services.IClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Clientes> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Clientes getClienteById(int id) {
        try {
            return clienteRepository.findByIdCliente(id);
        }catch (Exception e){
            e.getMessage();
            return null;
        }
    }

    @Override
    public boolean createCliente(ClientesDTO clientesDTO) {
        boolean isCreated=false;
        try {
            Clientes cliente  = modelMapper.map(clientesDTO, Clientes.class);
            clienteRepository.save(cliente);
            isCreated=true;
        }catch (Exception e){
            e.getMessage();
        }
        return isCreated;
    }
    @Override
    public boolean deleteCliente(int id) {
        try {
            clienteRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            ex.getMessage();
            return false;
        }
    }
}