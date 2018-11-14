package br.eti.carlosgeorgi.trabalhodeconclusaoboot.domain;

public enum Status {
	ABERTO(1),FINALIZADO(2),AGUARDANDO(3);
	
	private int valor;
	Status(int valor) {
		this.valor=valor;
	}
	public int getValor() {
		return this.valor;
	}
	
}
