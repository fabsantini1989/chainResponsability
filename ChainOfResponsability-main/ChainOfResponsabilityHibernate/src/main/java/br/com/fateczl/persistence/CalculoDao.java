package br.com.fateczl.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.SessionFactory;

import br.com.fateczl.model.Calculo;

public class CalculoDao implements IObjDao<Calculo> {

	private SessionFactory sf;

	public CalculoDao(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void insere(Calculo t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(t);
		transaction.commit();

	}

	@Override
	public void modifica(Calculo t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.merge(t);
		transaction.commit();

	}

	@Override
	public void remove(Calculo t) {
		EntityManager entityManager = sf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(t);
		transaction.commit();

	}

	@Override
	public Calculo busca(Calculo t) {
		EntityManager entityManager = sf.createEntityManager();
		t = entityManager.find(Calculo.class, t.getId());
		return t;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Calculo> lista() {
		List<Calculo> funcionarios = new ArrayList<Calculo>();
		String sql = ("SELECT id, nome, salario FROM funcionario");
		EntityManager entityManager = sf.createEntityManager();
		Query query = entityManager.createNativeQuery(sql);
		List<Object[]> lista = query.getResultList();
		for (Object[] obj : lista) {
			Calculo c = new Calculo();
			c.setId((int) obj[0]);
			c.setNome(obj[1].toString());
			c.setSalario((float) obj[2]);

			funcionarios.add(c);
		}

		return funcionarios;
	}

}
