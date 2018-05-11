package br.com.iesb.ia.sma;

import jade.core.Agent;

public class LinhaTerrea extends Agent {
	
	private static final long serialVersionUID = 833840896889673362L;
	private Long identificador;
	private String classe; //simples ou desvio
	private int prioridade; // Depende da execucao
	private String estado; //ocupada ou livre
	
	
	protected void setup(){
		
	}
	
	
	
	
	
	
	public Long getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
