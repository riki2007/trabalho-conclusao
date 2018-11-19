package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;


import java.math.BigDecimal;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;


@SuppressWarnings("serial")
@Entity
@Table(name="PRODUTOS")
public class Produto extends AbstractEntity<Long>{

	//############ATRIBUTOS#########
	
	@Column(nullable = false)
	private String nome;
	@Column(nullable = true)
	private String descricao;
	@Column(nullable = false)
	private int quantidade;
	
	@NumberFormat(style = Style.CURRENCY , pattern = "#,##0.00")
	@Column(nullable = false, columnDefinition = "DECIMAL (7,2) DEFAULT 0.00")
	private BigDecimal valor;
	
	//############RELACIONAMENTOS#########
	@ManyToMany
	private List<OrdemServico> ordens2;
	
	public List<OrdemServico> getOrdens2() {
		return ordens2;
	}
	public void setOrdens2(List<OrdemServico> ordens2) {
		this.ordens2 = ordens2;
	}
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

