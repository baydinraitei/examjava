package Com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Hotel {

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
