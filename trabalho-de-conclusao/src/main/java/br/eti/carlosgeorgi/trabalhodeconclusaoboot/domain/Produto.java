package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="PRODUTOS")
public class Produto extends AbstractEntity<Long>{

	//############ATRIBUTOS#########
	
	private String nome;
	private String descricao;
	private int quantidade;
	private BigDecimal valor;
	
	//############RELACIONAMENTOS#########
	@ManyToMany
	private List<OrdemServico> ordens2;
	
	//############GETTS AND SETTERs#########
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
}

