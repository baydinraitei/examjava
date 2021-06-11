package Com.controle;
import org.hibernate.Session;

import Com.model.Hotel;
import Com.service.chambreservices;
import Com.service.hotelservice;



public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hotelservice hs = new hotelservice();
		chambreservices cs = new chambreservices();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Hotel h1 = new Hotel("odalys", "60 avenue rockefeller , lyon", "0000000000");
		
		hs.create(h1, session);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		
	}

}