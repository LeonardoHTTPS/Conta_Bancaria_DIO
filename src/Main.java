
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Leonardo");
		
		Conta cc = new ContaCorrente(leonardo);
		Conta poupanca = new ContaPoupanca(leonardo);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
