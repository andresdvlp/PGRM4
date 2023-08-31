package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Short> {
}
