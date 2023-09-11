package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta,Short> {
    @Query(value = "select * from detalle_venta where id_detalle_venta =:idDetalleVenta",nativeQuery = true)
    DetalleVenta findByIdDetalleVenta(@Param("idDetalleVenta") Short idDetalleVenta);
}
