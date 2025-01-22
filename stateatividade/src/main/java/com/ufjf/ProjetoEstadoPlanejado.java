package com.ufjf;

public class ProjetoEstadoPlanejado extends ProjetoEstado{

    @Override
    public String getEstado() {
        return "Planejado";
    }

    public boolean iniciar() {
        return true;
    }

}
