package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;


import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ORDENS")
public class OrdemServico extends AbstractEntity<Long>{
	
	public OrdemServico() {
		this.total=new BigDecimal(0);
	}
	
	//############ATRIBUTOS#########
	@Column(nullable = false)
	private String equipamento;
	@Column(nullable = false)
	private String problema;
	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@Column(nullable = false)
	private BigDecimal total;
	
	//############RELACIONAMENTOS#########
	@ManyToOne
	@JoinColumn(name = "id_cliente_fk")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario_fk")
	private Funcionario1 funcionario;
	
	@ManyToMany(mappedBy = "ordens")
	private List<Servico> servicos;
	
	@ManyToMany(mappedBy = "ordens2")
	private List<Produto> produtos;
	
	
	//############GETTS AND SETTERs#########
	
	public String getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
	
}
