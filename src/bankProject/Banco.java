package bankProject;

import java.util.List;

public class Banco {

	private String nome = "JoBank";
	private List<Conta> contas;
	private List<Cliente> clientes;
	
	public String getNome() {
		return nome;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
