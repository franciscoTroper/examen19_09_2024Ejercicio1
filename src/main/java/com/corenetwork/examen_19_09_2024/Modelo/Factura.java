package com.corenetwork.examen_19_09_2024.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component

public class Factura {
    @Autowired
    @Qualifier("IvaGeneral")
    private IImpuesto iImpuesto;

    private List<Producto>productos;

    public double calcularTotalFactura()
    {
        double total=0;
        for (int a=0;a<productos.size();a++)
        {
            total+=iImpuesto.calcularImpuesto(productos.get(a));
        }
        return total;
    }
}
