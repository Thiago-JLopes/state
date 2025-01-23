package com.ufjf;

public class ProjetoEstadoConcluido extends ProjetoEstado{
    private ProjetoEstadoConcluido() {};
    private static ProjetoEstadoConcluido instance = new ProjetoEstadoConcluido();
    private static ProjetoEstadoConcluido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Concluido";
    }
}
