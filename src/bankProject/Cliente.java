package bankProject;

import utils.DataAtual;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataDeNascimento;
	private String dataCriacaoConta;

	public Cliente(String nome, String cpf, String data) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = data;
		this.dataCriacaoConta = DataAtual.getDataAtual();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
	
	public void imprimirInfos() {
		System.out.println(String.format("Nome: %s", this.nome));
		System.out.println(String.format("CPF: %s", this.cpf));
		System.out.println(String.format("Data de Nascimento: %s", this.dataDeNascimento));
		System.out.println(String.format("Cliente Desde: %s", this.dataCriacaoConta));
	}
	
}