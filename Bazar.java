package com.expresos;
import java.util.ArrayList;
import java.util.List;

public class Bazar {
    private List<Emprendedor> emprendedores;
    private List<Negocio> negocios;

    public Bazar() {
        this.emprendedores = new ArrayList<>();
        this.negocios = new ArrayList<>();
    }

    public void agregarEmprendedor(Emprendedor emprendedor) {
        emprendedores.add(emprendedor);
    }

    public void agregarNegocio(Negocio negocio) {
        negocios.add(negocio);
    }
}
