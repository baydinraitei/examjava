package Com.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import Com.model.Salarie;

public class salarieservices {
	
	public boolean create(Salarie salarie, Session session)
	{
	session.save(salarie);
	return true;
	}
	public void delete(Session session)
	{
	Salarie salarie = session.get(Salarie.class, 3);
	session.delete(salarie);
	}
	public void update(Session session, int id)
	{
	Salarie salarie = session.get(Salarie.class, id);
	salarie.setPrenom("Jean-Charles");
	session.update(salarie);
	}
	public Salarie findById(Session s, int id)
	{
	Salarie salarie = s.get(Salarie.class, id);
	return salarie;
	}
	public List<Salarie> findAll(Session s)
	{
	Query q = s.createQuery("from Salarie");
	List<Salarie> listeSalarie = q.list();
	return listeSalarie;
	}

}
