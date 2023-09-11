package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductosRepository extends JpaRepository<Productos,Short> {
    @Query(value = "select * from producto where id_producto =:idProducto",nativeQuery = true)
    Productos findByIdProducto(@Param("idProducto") Short idProducto);
}
