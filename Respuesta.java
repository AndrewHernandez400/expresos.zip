
package com.expresos;


import java.util.Date;

public class Respuesta {
   
    private String contenido;
    private Estudiante autor;
    private Date fecha;

    // Constructor
    public Respuesta(String contenido, Estudiante autor, Date fecha) {
        this.contenido = contenido;
        this.autor = autor;
        this.fecha = fecha;
    }


    public void publicarRespuesta() {
        System.out.println("Respuesta publicada por " + autor.getNombre() + " el " + fecha);
        System.out.println("Contenido: " + contenido);
    }

    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
    public Estudiante getAutor() {
        return autor;
    }

    public void setAutor(Estudiante autor) {
        this.autor = autor;
    }

    
    public Date getFecha() {
        return fecha;
    }
    
}
