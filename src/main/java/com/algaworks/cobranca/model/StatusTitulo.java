package com.algaworks.cobranca.model;

/**
 * 
 * @author ksa
 *
 */
public enum StatusTitulo {

	/**
	 * 
	 */
	PENDENTE("Pendente"), RECEBIDO("Recebido");

	/**
	 * 
	 */
	private String descricao;

	/**
	 * Construtor
	 * 
	 * @param descricao
	 */
	private StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

}
