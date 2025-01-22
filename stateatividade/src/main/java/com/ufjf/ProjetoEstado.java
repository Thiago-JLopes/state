package com.ufjf;

public abstract class ProjetoEstado {
    public abstract String getEstado();

    public boolean planejar(Projeto projeto) {
        return false;
    }

    public boolean iniciar(Projeto projeto) {
        return false;
    }

    public boolean darAndamento(Projeto projeto) {
        return false;
    }

    public boolean marcarAtraso(Projeto projeto) {
        return false;
    }

    public boolean cancelar(Projeto projeto) {
        return false;
    }

    public boolean concluir(Projeto projeto) {
        return false;
    }
}
