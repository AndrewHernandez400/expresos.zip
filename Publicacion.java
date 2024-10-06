package com.expresos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacion {
    private String titulo;
    private String contenido;
    private Date fecha;
    private List<Respuesta> respuestas;

    public Publicacion(String titulo, String contenido, Date fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.respuestas = new ArrayList<>();
    }

    public void agregarRespuesta(Respuesta respuesta) {
        respuestas.add(respuesta);
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
