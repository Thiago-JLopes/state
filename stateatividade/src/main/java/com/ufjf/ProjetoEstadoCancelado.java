package com.ufjf;

public class ProjetoEstadoCancelado extends ProjetoEstado{
    private ProjetoEstadoCancelado() {};
    private static ProjetoEstadoCancelado instance = new ProjetoEstadoCancelado();
    private static ProjetoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }
}
