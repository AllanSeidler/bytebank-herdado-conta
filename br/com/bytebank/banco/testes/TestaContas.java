package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.especial.ContaEspecial;

//br.com.bytebank.banco.testes.TestaContas
public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaEspecial ce = new ContaEspecial(123, 5555);
	
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		
		cc.transfere(10.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	
	
	
	}
}
