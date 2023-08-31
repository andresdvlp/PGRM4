package com.tienda.inventario.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedor")
public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idProveedor;
    private String nombreEmpresa;
    private String nombreProveedor;
    private String direccionProveedor;
    private String celularProveedor;

    public Short getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Short idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getCelularProveedor() {
        return celularProveedor;
    }

    public void setCelularProveedor(String celularProveedor) {
        this.celularProveedor = celularProveedor;
    }
}
