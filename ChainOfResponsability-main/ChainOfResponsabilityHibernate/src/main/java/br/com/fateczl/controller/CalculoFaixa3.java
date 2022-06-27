package br.com.fateczl.controller;

import br.com.fateczl.ICalculo;
import br.com.fateczl.model.Calculo;

public class CalculoFaixa3 implements ICalculo {

	@Override
	public float calculaDesconto(Calculo c) {
		float totalRecolher = 0;
		float salarioFinal = 0;
		float faixa1 = 0;
		float faixa2 = 0;
		float faixa3 = 0;
		if (c.getSalario() > 2427.35 || c.getSalario() <= 3641.03) {
			faixa1 = 1212.00f * 0.075f;
			faixa2 = 1215.35f * 0.09f;
			faixa3 = (c.getSalario() - 2427.35f) * 0.12f;
			totalRecolher = faixa1 + faixa2 + faixa3;
			salarioFinal = (c.getSalario() - totalRecolher);
		}

		return salarioFinal;
	}

	@Override
	public void proximoDesconto(Calculo c) {
		CalculoFaixa4 cf4 = new CalculoFaixa4();
		cf4.proximoDesconto(c);
	}

}
