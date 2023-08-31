package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VentaRepository extends JpaRepository<Ventas,Integer> {
    @Query(value = "select * from venta where id_venta=:idVenta", nativeQuery = true)
    Ventas findVentaById(@Param("idVenta") Integer idVenta);
}
