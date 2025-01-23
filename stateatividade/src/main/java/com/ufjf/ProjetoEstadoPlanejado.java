package com.ufjf;

public class ProjetoEstadoPlanejado extends ProjetoEstado{

    private ProjetoEstadoPlanejado() {};
    private static  ProjetoEstadoPlanejado instance = new ProjetoEstadoPlanejado();
    public static ProjetoEstadoPlanejado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Planejado";
    }

    public boolean iniciar(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        return true;
    }

    public boolean darAndamento(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        return true;
    }

    public boolean marcarAtraso(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        return true;
    }

    public boolean cancelar(Projeto projeto) {
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        return true;
    }

}
