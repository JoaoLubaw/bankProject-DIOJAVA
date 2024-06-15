package bankProject;

public class main {
	
	public static void main(String[] args) {
	Cliente joao = new Cliente("João", "111.111.111-01", "16/05/2004");
		
	Conta cc = new ContaCorrente(joao);
	Conta poupanca = new ContaPoupanca(joao);
	
	joao.imprimirInfos();
	
	cc.setLimiteDiario(2000);
	cc.setLimiteEspecial(1000);
	
	poupanca.setLimiteDiario(1000);
	poupanca.setLimiteEspecial(1000);
	
	cc.depositar(300.00);
	
	cc.sacar(300.00);
	
	cc.transferir(400.00, poupanca);
	
	cc.transferir(200.00, poupanca);
	
	cc.transferir(700.00, poupanca);
	
	cc.depositar(1000);
	
	cc.sacar(2000);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
	}
}
