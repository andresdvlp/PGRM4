package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedores,Short> {
}
