package br.com.fateczl.view;

import br.com.fateczl.controller.CalculoFaixa1;
import br.com.fateczl.model.Calculo;

public class Principal {

	public static void main(String[] args) {
		Calculo c = new Calculo();

		c.setId(1001);
		c.setNome("Fabiano");
		c.setSalario(8000.00f);

		if (c.getSalario() > 7087.22) {
			System.out.println("Você atingiu o teto de contribuição!");
		} else {
			CalculoFaixa1 cf1 = new CalculoFaixa1();
			cf1.proximoDesconto(c);

			System.out.println(c);
		}

	}

}
