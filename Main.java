package com.expresos;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear universidad
        Universidad universidad = new Universidad("Tecnológico de Antioquia");
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Maicol", 21, "Ingeniería");
        Publicacion publicacion1 = new Publicacion("Título 1", "Contenido de la publicación", new Date());
        estudiante1.agregarPublicacion(publicacion1);
        
        // Agregar estudiante a la universidad
        universidad.agregarEstudiante(estudiante1);

        // Crear un chisme
        Chisme chisme1 = new Chisme("¡Escuché que hay una nueva tienda en el campus!");
        chisme1.agregarEstudiante(estudiante1); // Agregar el estudiante al chisme
        
        // Crear un cliente
        Cliente cliente1 = new Cliente("Juan", 20, "Ciencias");
        
        // Crear un pedido
        Pedido pedido1 = new Pedido();
        pedido1.agregarItem(new Item("Item 1", 50.0)); // Suponiendo que el pedido tiene un ítem
        cliente1.agregarPedido(pedido1); // Agregar el pedido al cliente
        
        // Crear un emprendedor
        Bazar bazar1 = new Bazar();
        Emprendedor emprendedor1 = new Emprendedor("Carlos", 22, "Negocios", bazar1);
        
        // Crear un negocio
        Negocio negocio1 = new Negocio("Negocio 1");
        bazar1.agregarNegocio(negocio1);
        
        // Crear un ítem
        Item item2 = new Item("Item 2", 100.0);
        negocio1.agregarItem(item2);
        
        // Mostrar publicaciones
        for (Publicacion pub : estudiante1.getPublicaciones()) {
            System.out.println("Título: " + pub.getTitulo());
        }
        
        // Mostrar chismes
        System.out.println("Chisme: " + chisme1.getContenido());
        for (Estudiante est : chisme1.getEstudiantes()) {
            System.out.println("Estudiante involucrado: " + est.getNombre());
        }

        // Mostrar estudiantes en la universidad
        System.out.println("Estudiantes en la universidad " + universidad.getNombre() + ":");
        for (Estudiante est : universidad.getEstudiantes()) {
            System.out.println(est.getNombre());
        }
        
        // Mostrar pedidos del cliente
        System.out.println("Pedidos de " + cliente1.getNombre() + ":");
        for (Pedido ped : cliente1.getPedidos()) {
            System.out.println(ped.getItems().size() + "Pedido con " + " ítems.");
        }
    }
}


