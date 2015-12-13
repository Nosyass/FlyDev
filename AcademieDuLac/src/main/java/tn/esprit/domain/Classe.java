package tn.esprit.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Classe {
	
private int id ;
private String niveau ;
private String Libele ;
private AnneeScolaire annee ;
private List<FicheScolaire> fichesScolaires ;



@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNiveau() {
	return niveau;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}
public String getLibele() {
	return Libele;
}
public void setLibele(String libele) {
	Libele = libele;
}
@OneToOne
public AnneeScolaire getAnnee() {
	return annee;
}
public void setAnnee(AnneeScolaire annee) {
	this.annee = annee;
}

@OneToMany (mappedBy="classe")

public List<FicheScolaire> getFichesScolaires() {
	return fichesScolaires;
}
public void setFichesScolaires(List<FicheScolaire> fichesScolaires) {
	this.fichesScolaires = fichesScolaires;
}


}
