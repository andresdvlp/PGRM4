package com.tienda.inventario.ModelDTO;

public class ProveedoresDTO {

    private String nombreEmpresa;
    private String nombreProveedor;
    private String direccionProveedor;
    private String celularProveedor;

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
