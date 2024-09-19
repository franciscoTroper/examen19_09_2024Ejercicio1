package com.corenetwork.examen_19_09_2024.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class Producto {
    private String nombre;
    private double precio;
}
