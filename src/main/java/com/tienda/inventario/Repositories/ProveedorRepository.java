package com.tienda.inventario.Repositories;

import com.tienda.inventario.Entities.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedores,Short> {
    @Query(value = "select * from proveedor where id_proveedor =:idProveedor",nativeQuery = true)
    Proveedores findByIdProveedor(@Param("idProveedor") Short idProveedor);
}
