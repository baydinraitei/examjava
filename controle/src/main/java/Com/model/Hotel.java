package Com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Hotel {

	public Hotel(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public Hotel(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int idHotel;
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	@Column(name = "adresse", nullable = true, unique = false, length = 50)
	private String adresse;
	@Column(name = "telephone", nullable = true, unique = false, length = 50)
	private String telephone;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel_id")
	private Set<Chambre> chambres;
	
}
