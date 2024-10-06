package com.expresos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Estudiante {
    private List<Pedido> pedidos;

    public Cliente(String nombre, int edad, String carrera) {
        super(nombre, edad, carrera);
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Getters y Setters
}

