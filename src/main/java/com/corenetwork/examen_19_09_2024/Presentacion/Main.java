package com.corenetwork.examen_19_09_2024.Presentacion;

import com.corenetwork.examen_19_09_2024.Modelo.Factura;
import com.corenetwork.examen_19_09_2024.Modelo.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Configuration
@ComponentScan(basePackages = "com.corenetwork.examen_19_09_2024.Presentacion")
@Component
@Qualifier("IvaGeneral")
@SpringBootApplication
public class Main {

    @Autowired
    private Producto producto;
    @Autowired
    private Factura factura;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        context.refresh();
        Main main = context.getBean(Main.class);
        main.run();
    }

    public void run() {

        factura.getProductos().add(new Producto("manzana", 3.5));
        factura.getProductos().add(new Producto("peras",2.5));
        factura.getProductos().add(new Producto("naranjas",1.4));

        System.out.println(factura.calcularTotalFactura());

    }

}

