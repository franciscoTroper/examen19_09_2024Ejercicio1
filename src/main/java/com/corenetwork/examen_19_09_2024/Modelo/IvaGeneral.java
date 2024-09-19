package com.corenetwork.examen_19_09_2024.Modelo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class IvaGeneral implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto producto) {
        return producto.getPrecio()*0.1;
    }
}
