package com.algaworks.cobranca.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Titulo {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	/**
	 * 
	 */
	private String descricao;
	/**
	 * 
	 */
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	/**
	 * 
	 */
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;
	/**
	 * 
	 */
	@Enumerated(EnumType.STRING)
	private StatusTitulo status;

	/**
	 * 
	 * @return
	 */
	public Long getCodigo() {
		return codigo;

	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * 
	 * @return
	 */
	public Date getDataVencimento() {
		return dataVencimento;
	}

	/**
	 * 
	 * @param dataVencimento
	 */
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getValor() {
		return valor;
	}

	/**
	 * 
	 * @param valor
	 */
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	/**
	 * 
	 * @return
	 */
	public StatusTitulo getStatus() {
		return status;
	}

	/**
	 * 
	 * @param status
	 */
	public void setStatus(StatusTitulo status) {
		this.status = status;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPendente() {
		return StatusTitulo.PENDENTE.equals(this.status);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}