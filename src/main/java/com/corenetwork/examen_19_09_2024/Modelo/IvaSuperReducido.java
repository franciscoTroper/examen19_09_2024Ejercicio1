package com.corenetwork.examen_19_09_2024.Modelo;

import org.springframework.stereotype.Component;

@Component
public class IvaSuperReducido implements IImpuesto{
    @Override
    public double calcularImpuesto(Producto producto) {
        return producto.getPrecio()*0.01;
    }
}
