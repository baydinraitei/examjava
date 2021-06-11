package Com.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Chambre")
public class Chambre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "numChambre", nullable = false, unique = true)
private int numChambre;
@Column(name = "superficie", nullable = true)
private double superficie;
@Column(name = "type", nullable = true, unique = false, length = 50)
private String type;
@Column(name = "etage", nullable = true, unique = false)
private int etage;
@ManyToOne
private Hotel hotel;
public Chambre() {
super();
}

 public Chambre(double superficie, String type, int etage) {
super();
this.superficie = superficie;
this.type = type;
this.etage = etage;
}

 public int getNumChambre() {
return numChambre;
}

 public void setNumChambre(int numChambre) {
this.numChambre = numChambre;
}

 public double getSuperficie() {
return superficie;
}

 public void setSuperficie(double superficie) {
this.superficie = superficie;
}

 public String getType() {
return type;
}

 public void setType(String type) {
this.type = type;
}

 public int getEtage() {
return etage;
}

 public void setEtage(int etage) {
this.etage = etage;
}

 public Hotel getHotel() {
return hotel;
}

 public void setHotel(Hotel hotel) {
this.hotel = hotel;
}


}