package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {
    @Query(value = "select * from cliente where id_cliente =:idCliente",nativeQuery = true)
    Clientes findByIdCliente(@Param("idCliente") Long idCliente);

    List<Clientes> findByDeleted(Boolean deleted);

    @Query(value = "select * from cliente where celular_cliente =:celularCliente", nativeQuery = true)
    Optional<Clientes> findByCelularCliente(@Param("celularCliente") Long celularCliente);
}
