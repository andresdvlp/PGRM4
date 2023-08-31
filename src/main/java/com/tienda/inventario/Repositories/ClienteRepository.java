package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
    @Query(value = "select * from cliente where id_cliente =:idCliente",nativeQuery = true)
    Clientes findByIdCliente(@Param("idCliente") int idCliente);
}
