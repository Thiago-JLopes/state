package com.ufjf;

public class ProjetoEstadoAtrasado extends ProjetoEstado {
    private ProjetoEstadoAtrasado() {};
    private static  ProjetoEstadoAtrasado instance = new ProjetoEstadoAtrasado();
    public static ProjetoEstadoAtrasado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Atrasado";
    }

    public boolean darAndamento(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        return true;
    }

    public boolean cancelar(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        return true;
    }

    public boolean concluir(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        return true;
    }
}
