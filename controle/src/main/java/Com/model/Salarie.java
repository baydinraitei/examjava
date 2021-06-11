package Com.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Salarie {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private int idSalarie;
	@Column(name = "nom", nullable = true, unique = false, length = 50)
	private String nom;
	@Column(name = "prenom", nullable = true, unique = false, length = 50)
	private String prenom;
	@Column(name = "salaire", nullable = true, unique = false)
	private double salaire;
	@Column(name = "experience", nullable = true, unique = false)
	private int experience;
	
}
