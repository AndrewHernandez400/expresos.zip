package com.expresos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String descripcion;
    private List<Producto> productos;

    public Pedido(String descripcion) {
        this.descripcion = descripcion;
        this.productos = new ArrayList<>();
    }

    Pedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    // Getters
    public String getDescripcion() {
        return descripcion;
    }

    void agregarItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
