package br.com.iesb.ia.sma;

import java.util.List;

import jade.core.Agent;

public class EstacaoDeControle extends Agent {
	
	private static final long serialVersionUID = 7503458692702240903L;
	private Long identificador;
	private int prioridade;
	private List<EstacaoDeControle> estacoesVizinhas;
	private List<LinhaTerrea> linhasVizinhas;
	
	
	public EstacaoDeControle(Long id) {
		setIdentificador(id);
	}





	protected void setup(){
		
	}
	
	
	
	
	
	public Long getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
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





	public List<LinhaTerrea> getLinhasVizinhas() {
		return linhasVizinhas;
	}





	public void setLinhasVizinhas(List<LinhaTerrea> linhasVizinhas) {
		this.linhasVizinhas = linhasVizinhas;
	}

}
