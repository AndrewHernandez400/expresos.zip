package com.expresos;

public class Item {
    private String nombre;  // Nombre del ítem
    private double precio;  // Precio del ítem

    // Constructor
    public Item(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters opcionales en caso de que quieras cambiar los valores después de la creación
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
