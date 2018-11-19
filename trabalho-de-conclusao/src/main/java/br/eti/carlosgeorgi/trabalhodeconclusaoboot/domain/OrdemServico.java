package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

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
	
	@NumberFormat(style = Style.CURRENCY , pattern = "#,##0.00")
	@Column(nullable = false)
	private BigDecimal total;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "data_entrada", nullable = false, columnDefinition = "DATE")
	private LocalDate dataEntrada;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name= "data_saida", nullable = false, columnDefinition = "DATE")
	private LocalDate dataSaida;
	
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
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario1 getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario1 funcionario) {
		this.funcionario = funcionario;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
