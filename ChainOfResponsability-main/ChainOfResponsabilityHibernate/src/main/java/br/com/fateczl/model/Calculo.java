package br.com.fateczl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Calculo {

	@Id
	@Column(unique = true)
	private int id;
	@Column(name = "nome", length = 60)
	private String nome;
	@Column
	private float salario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Calculo [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}

}
