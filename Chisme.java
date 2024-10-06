package com.expresos;

import java.util.ArrayList;
import java.util.List;

public class Chisme {
    private String contenido;                     // Atributo que almacena el contenido del chisme
    private List<Estudiante> estudiantes;        // Lista de estudiantes asociados al chisme

    public Chisme(String contenido) {
        this.contenido = contenido;               // Inicializa el contenido del chisme
        this.estudiantes = new ArrayList<>();     // Inicializa la lista de estudiantes
    }

    // Método para agregar un estudiante a la lista
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para obtener la lista de estudiantes
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Getter para el contenido del chisme
    public String getContenido() {
        return contenido;
    }
}

