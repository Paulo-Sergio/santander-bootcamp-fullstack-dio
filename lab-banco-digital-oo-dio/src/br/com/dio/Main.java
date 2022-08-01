package br.com.dio;

import br.com.dio.model.Cliente;
import br.com.dio.model.Conta;
import br.com.dio.model.ContaCorrente;
import br.com.dio.model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		Conta cc = new ContaCorrente(paulo);
		Conta poupanca = new ContaPoupanca(paulo);

		cc.depositar(100);
		cc.transferir(90, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
