package br.com.fateczl.controller;

import br.com.fateczl.ICalculo;
import br.com.fateczl.model.Calculo;

public class CalculoFaixa2 implements ICalculo{

	@Override
	public float calculaDesconto(Calculo c) {
		float totalRecolher = 0;
		float salarioFinal = 0;
		float faixa1 = 0;
		float faixa2 = 0;
		if (c.getSalario() > 1212.00 || c.getSalario() <= 2427.35) {
			faixa1 = 1212.00f * 0.075f;
			faixa2 = 1215.35f * 0.09f;
			totalRecolher = faixa1 + faixa2;
			salarioFinal = (c.getSalario() - totalRecolher);
		}

		return salarioFinal;
	}

	@Override
	public void proximoDesconto(Calculo c) {
		CalculoFaixa3 cf3 = new CalculoFaixa3();
		cf3.proximoDesconto(c);
	}

}
