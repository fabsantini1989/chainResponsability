package br.com.fateczl.controller;

import br.com.fateczl.ICalculo;
import br.com.fateczl.model.Calculo;

public class CalculoFaixa1 implements ICalculo {

	@Override
	public float calculaDesconto(Calculo c) {
		float calculoFinal = 0;
		float aliquotaEfetiva = 0;
		float salarioFinal = 0;
		if (c.getSalario() <= 1212.00) {
			calculoFinal = 90.90f + ((c.getSalario() - 1212.00f) * 9 ) / 100;
			aliquotaEfetiva = calculoFinal / c.getSalario();
			salarioFinal = c.getSalario() - (c.getSalario() * aliquotaEfetiva);
		}

		return salarioFinal;
	}

	@Override
	public void proximoDesconto(Calculo c) {
		CalculoFaixa2 cf2 = new CalculoFaixa2();
		cf2.proximoDesconto(c);
		
	}

}
