package br.com.iesb.ia.sma;

import java.util.List;

import jade.core.Agent;

public class EstacaoDeControle extends Agent {
	
	private static final long serialVersionUID = 7503458692702240903L;
	private Long Identificador;
	private int prioridade;
	private List<EstacaoDeControle> estacoesVizinhas;
	
	
	protected void setup(){
		
	}
	
	
	
	
	
	public Long getIdentificador() {
		return Identificador;
	}
	
	public void setIdentificador(Long identificador) {
		Identificador = identificador;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public List<EstacaoDeControle> getEstacoesVizinhas() {
		return estacoesVizinhas;
	}

	public void setEstacoesVizinhas(List<EstacaoDeControle> estacoesVizinhas) {
		this.estacoesVizinhas = estacoesVizinhas;
	}

}
