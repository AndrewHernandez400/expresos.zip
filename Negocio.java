package com.expresos;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    private String nombre; // Nombre del negocio
    private List<Item> items; // Lista de items en el negocio

    // Constructor
    public Negocio(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<>(); // Inicializa la lista de items
    }

    // Método para agregar un item al negocio
    public void agregarItem(Item item) {
        items.add(item); // Agrega el item a la lista
    }

    // Getter para obtener la lista de items
    public List<Item> getItems() {
        return items;
    }

    // Getter para el nombre del negocio
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre del negocio (opcional)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
