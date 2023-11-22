package com.tienda.inventario.ModelDTO;

import lombok.Data;

@Data
public class ProveedoresDTO {

    private String nombreEmpresa;
    private String nombreProveedor;
    private String direccionProveedor;
    private String celularProveedor;
    private boolean deleted;
}
