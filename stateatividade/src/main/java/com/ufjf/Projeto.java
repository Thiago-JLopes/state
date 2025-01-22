package com.ufjf;

public class Projeto {
    private String idProjeto;
    private ProjetoEstado estado;

    public Projeto() {

    }

    public void setEstado(ProjetoEstado estado) {
        this.estado = estado;
    }

    public boolean planejar() {
        return estado.planejar(this);
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean darAndamento() {
        return estado.darAndamento(this);
    }

    public boolean marcarAtraso() {
        return estado.marcarAtraso(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }
}
