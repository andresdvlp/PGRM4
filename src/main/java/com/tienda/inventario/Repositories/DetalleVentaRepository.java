package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta,Short> {
}
