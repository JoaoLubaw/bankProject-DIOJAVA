package bankProject;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private double limiteDiario;
	private double limiteEspecial;

	public Conta(Cliente cliente){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public double getLimiteDiario() {
		return limiteDiario;
	}
	
	public void setLimiteDiario(double limiteDiario) {
		this.limiteDiario = limiteDiario;
	}
	
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void sacar(double valor) {
		if (limiteDiario >= valor) {
				if (saldo >= valor) {
					saldo -= valor;
					limiteDiario-= valor;
					System.out.println(String.format("Saldo: %.2f", this.saldo));
				} else if (saldo + limiteEspecial >= valor) {
					saldo -= valor; 	
					limiteDiario-= valor;
					System.out.println(String.format("Saldo insuficiente, foi utilizado do seu limite especial o montante de R$ %.2f", (this.saldo - (this.saldo + this.saldo))));
					System.out.println(String.format("Saldo: %.2f", this.saldo)); 
					
				} else {
					System.out.println("Saldo insuficiente");
				}
		} else {
			System.out.println("Valor maior que o limite diário.");
		}
	}
	

	public void depositar(double valor) {
		saldo += valor;
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	private void receberTransferencia(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if (limiteDiario >= valor) {
				if (saldo >= valor) {
					this.sacar(valor);
					contaDestino.receberTransferencia(valor);
					System.out.println("Transferencia realizada");
				} else if (saldo + limiteEspecial >= valor) {
					this.sacar(valor);
					contaDestino.receberTransferencia(valor);
				} else {
					System.out.println("Saldo insuficiente");
				}
		} else {
			System.out.println("Valor maior que o limite diário.");
		}
	}
	
		
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Limite Especial: %.2f", this.limiteEspecial));
		System.out.println(String.format("Limite Diário: %.2f", this.limiteDiario));
	}
	
	protected void imprimirExtrato() {}
	
}
