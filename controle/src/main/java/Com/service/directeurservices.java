package Com.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import Com.model.Directeur;

public class directeurservices {
	public boolean create(Directeur d, Session session)
	{
	session.save(d);
	return true;
	}
	public void delete(Session session)
	{
	Directeur d = session.get(Directeur.class, 3);
	session.delete(d);
	}
	public void update(Session session, int id)
	{
	Directeur d = session.get(Directeur.class, id);
	d.setnom("Pascal");
	session.update(d);
	}
	public Directeur findById(Session s, int id)
	{
	Directeur d = s.get(Directeur.class, id);
	return d;
	}
	public List<Directeur> findAll(Session s)
	{
	Query q = s.createQuery("from Directeur");
	List<Directeur> listeDirecteur = q.list();
	return listeDirecteur;
	}
	

}
