package br.com.fateczl.controller;

import br.com.fateczl.ICalculo;
import br.com.fateczl.model.Calculo;

public class CalculoFaixa4 implements ICalculo {

	@Override
	public float calculaDesconto(Calculo c) {
		float totalRecolher = 0;
		float salarioFinal = 0;
		float faixa1 = 0;
		float faixa2 = 0;
		float faixa3 = 0;
		float faixa4 = 0;
		
		if (c.getSalario() > 3641.03 || c.getSalario() <= 7087.22) {
			faixa1 = 1212.00f * 0.075f;
			faixa2 = 1215.35f * 0.09f;
			faixa3 = 1213.68f * 0.12f;
			faixa4 = (c.getSalario() - 3641.03f) * 0.14f;
			totalRecolher = faixa1 + faixa2 + faixa3 + faixa4;
			salarioFinal = (c.getSalario() - totalRecolher);
		}

		return salarioFinal;
	}

	@Override
	public void proximoDesconto(Calculo c) {
		c.setSalario(calculaDesconto(c));

	}

}
