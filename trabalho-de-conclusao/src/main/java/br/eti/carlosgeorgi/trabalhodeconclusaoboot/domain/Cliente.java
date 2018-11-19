package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CLIENTES")
public class Cliente extends Pessoa{

	 public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	//############RELACIONAMENTOS#########
		
			@OneToOne(cascade = CascadeType.ALL)
			@JoinColumn(name = "endereco_id_fk")
			private Endereco1 endereco;	
			
	 
	public Endereco1 getEndereco() {
				return endereco;
			}


			public void setEndereco(Endereco1 endereco) {
				this.endereco = endereco;
			}


			public List<OrdemServico> getOrdensdeservico() {
				return ordensdeservico;
			}


			public void setOrdensdeservico(List<OrdemServico> ordensdeservico) {
				this.ordensdeservico = ordensdeservico;
			}

	@OneToMany(mappedBy = "cliente")
	 private List<OrdemServico> ordensdeservico;
	
}
