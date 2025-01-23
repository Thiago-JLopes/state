package com.ufjf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProjetoTest {

    Projeto projeto;

    @BeforeEach
    public void setUp() {
        projeto = new Projeto();
    }

    //Projeto planejado

    @Test
    public  void naoDevePlanejarProjetoPlanejado(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertFalse(projeto.planejar());
    }

    @Test
    public void deveIniciarProjetoPlanejado(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertTrue(projeto.iniciar());
        assertEquals(ProjetoEstadoPlanejado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveMarcarComoAtrasadpProjetoPlanejado(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertTrue(projeto.marcarAtraso());
        assertEquals(ProjetoEstadoPlanejado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveCancelarProjetoPlanejado(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertTrue(projeto.cancelar());
        assertEquals(ProjetoEstadoPlanejado.getInstance(), projeto.getEstado());
    }

    //Projeto iniciado

    @Test
    public void naoDeveIniciarProjetoIniciado(){
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        assertFalse(projeto.iniciar());
    }

    @Test
    public void deveDarAndamentoProjetoIniciado(){
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        assertTrue(projeto.darAndamento());
        assertEquals(ProjetoEstadoIniciado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveMarcarAtrasadoProjetoIniciado(){
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        assertTrue(projeto.marcarAtraso());
        assertEquals(ProjetoEstadoIniciado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveConcluirProjetoIniciado(){
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        assertTrue(projeto.concluir());
        assertEquals(ProjetoEstadoIniciado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveCancelarProjetoIniciado(){
        projeto.setEstado(ProjetoEstadoIniciado.getInstance());
        assertTrue(projeto.cancelar());
        assertEquals(ProjetoEstadoIniciado.getInstance(), projeto.getEstado());
    }

    // Projeto Andamento
    @Test
    public void naoDeveDarAndamentoProjetoAndamento(){
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        assertFalse(projeto.darAndamento());
    }

    @Test
    public void deveMarcarAtrasadoProjetoAndamento(){
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        assertTrue(projeto.marcarAtraso());
        assertEquals(ProjetoEstadoAndamento.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveCancelarProjetoAndamento(){
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        assertTrue(projeto.cancelar());
        assertEquals(ProjetoEstadoAndamento.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveConcluirProjetoAndamento(){
        projeto.setEstado(ProjetoEstadoAndamento.getInstance());
        assertTrue(projeto.concluir());
        assertEquals(ProjetoEstadoAndamento.getInstance(), projeto.getEstado());
    }

    //Projeto Atrasado
    @Test
    public void naodeveMarcarAdrasadoProjetoAtrasado(){
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        assertFalse(projeto.marcarAtraso());
    }

    @Test
    public void deveConcluirProjetoAtrasado(){
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        assertTrue(projeto.concluir());
        assertEquals(ProjetoEstadoAtrasado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveCancelarProjetoAtrasado(){
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        assertTrue(projeto.cancelar());
        assertEquals(ProjetoEstadoAtrasado.getInstance(), projeto.getEstado());
    }

    @Test
    public void deveDarAndamentoProjetoAtrasado(){
        projeto.setEstado(ProjetoEstadoAtrasado.getInstance());
        assertTrue(projeto.darAndamento());
        assertEquals(ProjetoEstadoAtrasado.getInstance(), projeto.getEstado());
    }

    //Projeto Cancelado

    @Test
    public void naoDeveConcluirProjetoConcluido(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.concluir());
    }

    @Test
    public void naoDeveCancelarProjetoConcluido(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.cancelar());
    }

    @Test
    public void naoDevePlanejarProjetoCancelado(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertFalse(projeto.planejar());
    }

    @Test
    public void naoDeveDarAndamentoProjetoCancelado(){
        projeto.setEstado(ProjetoEstadoCancelado.getInstance());
        assertFalse(projeto.darAndamento());
    }

    @Test
    public void naoDeveIniciarProjetoCancelado(){
        projeto.setEstado(ProjetoEstadoCancelado.getInstance());
        assertFalse(projeto.iniciar());
    }

    @Test
    public void naoDeveMarcarAtrasadoCancelado(){
        projeto.setEstado(ProjetoEstadoCancelado.getInstance());
        assertFalse(projeto.marcarAtraso());
    }


    //Projeto Concluido
   @Test
    public void naoDeveConcluirProjetoConcluido2(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.concluir());
   }

   @Test
    public void naoDeveCancelarProjetoConcluido2(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.cancelar());
   }

   @Test
    public void naoDevePlanejarProjetoConcluido(){
        projeto.setEstado(ProjetoEstadoPlanejado.getInstance());
        assertFalse(projeto.planejar());
   }

   @Test
    public void naoDeveDarAndamentoProjetoConcluido(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.darAndamento());
   }

   @Test
    public void naoDeveIniciarProjetoConcluido(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.iniciar());
   }

   @Test
    public void naoDeveMarcarAtrasadoConcluido(){
        projeto.setEstado(ProjetoEstadoConcluido.getInstance());
        assertFalse(projeto.marcarAtraso());
   }

}