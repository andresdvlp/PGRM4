package com.tienda.inventario.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "proveedor")
@Data
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idProveedor;
    private String nombreEmpresa;
    private String nombreProveedor;
    private String direccionProveedor;
    private String celularProveedor;

    public Proveedores() {
    }
    public Proveedores(Short idProveedor, String nombreEmpresa, String nombreProveedor, String direccionProveedor, String celularProveedor) {
        this.idProveedor = idProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreProveedor = nombreProveedor;
        this.direccionProveedor = direccionProveedor;
        this.celularProveedor = celularProveedor;
    }
}
