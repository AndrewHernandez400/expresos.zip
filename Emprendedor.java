package com.expresos;

// La clase Emprendedor hereda de Estudiante
public class Emprendedor extends Estudiante {
    private Bazar bazar; // Referencia al bazar del emprendedor

    // Constructor
    public Emprendedor(String nombre, int edad, String carrera, Bazar bazar) {
        super(nombre, edad, carrera); // Llama al constructor de la superclase Estudiante
        this.bazar = bazar; // Inicializa la referencia al bazar
    }

    // Getter para el bazar
    public Bazar getBazar() {
        return bazar;
    }

    // Setter para el bazar (opcional)
    public void setBazar(Bazar bazar) {
        this.bazar = bazar;
    }
}


