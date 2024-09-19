package com.corenetwork.examen_19_09_2024.Modelo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public interface IImpuesto {
    double calcularImpuesto(Producto producto);
}
