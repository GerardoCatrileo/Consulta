package cl.consulta.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import cl.consulta.web.model.Register;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(Register user) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Register getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Register user = (Register) session.load(Register.class, new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Register> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Register> userList = session.createCriteria(Register.class).list();
		tx.commit();
		session.close();
		return userList;
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Register.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
