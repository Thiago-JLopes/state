package com.ufjf;

public class ProjetoEstadoIniciado extends ProjetoEstado {
    private ProjetoEstadoIniciado() {};
    private static  ProjetoEstadoIniciado instance = new ProjetoEstadoIniciado();
    public static ProjetoEstadoIniciado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Iniciado";
    }

    public boolean darAndamento(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        return true;
    }

    public boolean marcarAtraso(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        return true;
    }

    public boolean cancelar(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        return true;
    }

    public boolean concluir(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        return true;
    }
}
