package Com.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import Com.model.Chambre;
import Com.model.Hotel;

public class chambreservices {
	
	public boolean create(Hotel h, Session session) { 
		session.save(h); return true; } public void delete(Session session)
	{ Hotel h = session.get(Hotel.class, 3); session.delete(h); }
	
	public void update(Session s, int id) 
	{ Hotel h = s.get(Hotel.class, id); h.setNom("Paul"); s.update(h); } public Hotel findById(Session s, int id)
	{ Hotel c = s.get(Hotel.class, id); return c; }
	
	public List<Hotel> findAll(Session s)
	{ Query q = s.createQuery("from Hotel"); List<Hotel> listeHotel = q.list(); return listeHotel; }

	public boolean create(Chambre c, Session session) 
	{ session.save(c); 
	return true; }
	
	
}
