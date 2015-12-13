package tn.esprit.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AnneeScolaire {
   private int id ;
	private Date Date_Deb_Annee ;
	private Date Date_Fin_Annee ;
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate_Deb_Annee() {
		return Date_Deb_Annee;
	}
	public void setDate_Deb_Annee(Date date_Deb_Annee) {
		Date_Deb_Annee = date_Deb_Annee;
	}
	public Date getDate_Fin_Annee() {
		return Date_Fin_Annee;
	}
	public void setDate_Fin_Annee(Date date_Fin_Annee) {
		Date_Fin_Annee = date_Fin_Annee;
	}
	
	
	
	
}
