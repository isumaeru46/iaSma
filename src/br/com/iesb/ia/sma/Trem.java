package br.com.iesb.ia.sma;

import java.util.List;

import jade.core.Agent;

public class Trem extends Agent {
	
	private static final long serialVersionUID = -2138810881983489400L;
	private Long identificador;
	private String classe; //passageiro ou cargueiro
	private List<LinhaTerrea> rotas;
	private int prioridade; //1- passageiro 2- cargueiro
	private LinhaTerrea posicao;
	private String estado; //parado ou em movimento
	private String sentido; //direto ou reverso
	
	
	
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

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	public List<LinhaTerrea> getRotas() {
		return rotas;
	}

	public void setRotas(List<LinhaTerrea> rotas) {
		this.rotas = rotas;
	}

	public LinhaTerrea getPosicao() {
		return posicao;
	}

	public void setPosicao(LinhaTerrea posicao) {
		this.posicao = posicao;
	}

}
