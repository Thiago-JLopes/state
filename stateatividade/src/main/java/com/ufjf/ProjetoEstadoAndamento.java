package com.ufjf;

public class ProjetoEstadoAndamento extends ProjetoEstado {
    private ProjetoEstadoAndamento() {};
    private static  ProjetoEstadoAndamento instance = new ProjetoEstadoAndamento();
    public static ProjetoEstadoAndamento getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Andamento";
    }

    public boolean marcarAtraso(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        return true;
    }

    public boolean cancelar(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        return true;
    }

    public boolean concluir(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        return true;
    }
}
