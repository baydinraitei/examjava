package Com.model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class directeur {

	public boolean create(directeur d, Session session)
	{
	session.save(d);
	return true;
	}
	public void delete(Session session)
	{
	directeur d = session.get(directeur.class, 3);
	session.delete(d);
	}
	public void update(Session session, int id)
	{
	directeur d = session.get(directeur.class, id);
	d.setnom("Pascal");
	session.update(d);
	}
	public directeur findById(Session s, int id)
	{
	directeur d = s.get(directeur.class, id);
	return d;
	}
	public List<directeur> findAll(Session s)
	{
	Query q = s.createQuery("from Directeur");
	List<directeur> listeDirecteur = q.list();
	return listeDirecteur;
	}
}
